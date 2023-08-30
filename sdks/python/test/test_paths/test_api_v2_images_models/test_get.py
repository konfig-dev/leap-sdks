# coding: utf-8

"""
    Leap

    The Official Leap API

    The version of the OpenAPI document: 1.0
    Created by: https://tryleap.ai/
"""

import unittest
from unittest.mock import patch

import urllib3

import leap
from leap.paths.api_v2_images_models import get
from leap import configuration, schemas, api_client

from .. import ApiTestMixin


class TestApiV2ImagesModels(ApiTestMixin, unittest.TestCase):
    """
    ApiV2ImagesModels unit test stubs
        List All Models
    """

    def setUp(self):
        pass

    def tearDown(self):
        pass

    response_status = 200




if __name__ == '__main__':
    unittest.main()
