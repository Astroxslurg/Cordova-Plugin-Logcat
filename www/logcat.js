var exec = cordova.require('cordova/exec'); // eslint-disable-line no-undef

module.exports = {
	log: function(message, successCB, failureCB) {
		exec(successCB, failureCB, "LogCat","log", [message]);
	},
};
