module.exports = function(message, successCB, failureCB) {
	cordova.exec(successCB, failureCB, "LogCat","log", [message]);
};

