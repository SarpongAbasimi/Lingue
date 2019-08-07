const router = require('express').Router(),
index = require('../controller/index');


router.get('/', index.index)


module.exports = router