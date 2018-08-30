var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'URL Shortner' });
});


/* PUT shorten url */
router.post('/shorten', function(req, res, next) {
  console.log("POST call triggered!");
});

module.exports = router;
