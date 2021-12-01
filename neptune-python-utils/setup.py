from setuptools import setup, find_packages

# minimal required packages for installation
required_packages = [
    "gremlinpython==3.5.1",
    "requests",
    "backoff",
    "cchardet",
    "aiodns",
    "idna-ssl",
    "boto3",
    "botocore",
    "aiohttp",
]

# Specific use case dependencies
extras = {
    "streams": [
        "ipywidgets",
        "ipython"
    ],
}

setup(
    author="Christian Curry",
    author_email='christian.curry@cox.com',
    python_requires='>=3.7',
    description="Fork of awslabs/amazon-neptune-tools for internal distribution",
    include_package_data=True,
    name='neptune-python-utils',
    packages=["neptune_python_utils"],
    package_dir={"proj": "neptune_python_utils"},
    install_requires=required_packages,
    extras_require=extras,
)

