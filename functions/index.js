const {onRequest} = require("firebase-functions/v2/https");
const admin = require("firebase-admin");
admin.initializeApp();

exports.handleDarajaCallback = onRequest((req, res) => {
  // Log the incoming callback data from Daraja
  const callbackData = req.body;
  console.log("Callback Data:", callbackData);

  // You can perform additional processing here, such  data to Firestore
  // Example: Save the callback data to Firestore named "darajaCallbacks"
  admin.firestore().collection("darajaCallbacks").add(callbackData)
      .then(() => {
        console.log("Callback data saved to Firestore");
        res.status(200).send("Callback received and saved");
      })
      .catch((error) => {
        console.error("Error saving callback data to Firestore:", error);
        res.status(500).send("Error saving callback data");
      });
});
