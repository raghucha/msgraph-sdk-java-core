# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added

### Changed

## [2.0.11] - 2022-02-04

### Added

- Removing lock on Http protocol 1.1 in preparation for Graph service support of Http2 #429

### Changed

- Bumps Azure Core to 1.24.1 #408, #409, #410
- Bumps mockito-inline to 4.3.1 #422, #423, #424
- Bumps okhttp to 4.9.3 #371, #372
- Bumps junit to 4.13.2 #391, #394
- Bumps junit-jupiter-api to 5.8.2 #379, #382
- Bumps junit-jupiter-egine to 5.8.2 #380
- Bumps junit-jupiter-params to 5.8.2 #381, #383
- Bumps gradle wrappers to 7.3.3 #426
- Bumps gradle-versions-plugin to 0.42.0 in /android #428
- Bumps gradle from 7.1.0 in /android #425
- Bumps gradle-enterprise-gradle-plugin 3.8.1 in /android #413
- Bumps dawidd6/action-download-artifact to 2.17.0 #427
- Bumps com.github.spotbugs to 5.0.5 #416
- Bumps spotbugs-annotations to 4.5.3 #407
- Bumps azure-identity to 1.4.3 #411, #412
- Bumps anton-yurchenko/git-release to 4.2 #378
- Bumps actions/cache from to 2.1.7 #375

## [2.0.10] - 2021-11-16

### Added

- Added support for cancelling requests #361

### Changed

- Fixed a bug where batching would fail for national clouds
- Bumps Azure Core from 1.20.0 to 1.22.0 #359, #360, #341, #342
- Bumps gson from 2.8.8 to 2.8.9 #356, #355
- Bumps actions/checkout from 2.3.5 to 2.4.0 #358, #349
- Upgrades CI pipeline to Java 17 #348, #330
- Bumps mockito-inline from 3.12.4 to 4.0.0 #346, #345
- Bumps action-download-artifact from 2.14.1 to 2.15.0 #344
- Bumps okhttp from 4.9.1 to 4.9.2 #339, #340
- Bumps guava from 30.1.1 to 31.0.1 #338, #337, #335, #336
- Bumps junit-jupiter-api from 5.8.0 to 5.8.1 #332, #334
- Bumps junit-jupiter-egine from 5.8.0 to 5.8.1 #333

## [2.0.9] - 2021-09-17

### Added

- Workflow for Maven preview and GitHub Release
- Workflow for build validation
- Proper handling for InterruptedException

### Changed

- Casing fixed for Odata type parsing
- Removed .azure-pipelines/**
