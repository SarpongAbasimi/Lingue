const router = require('express').Router(),
index = require('../controller/index');


router.get('/', index.index)

router.post('/', index.indexPost)

module.exports = router