#!/bin/bash
echo -e "Incrementing Dev versioning"

CURRENT_VERSION=$(mvn help:evaluate -Dexpression=devBuild -q -DforceStdout)
NEW_VERSION=$((CURRENT_VERSION + 1))
mvn versions:set-property -Dproperty=devBuild -DnewVersion=$NEW_VERSION

echo -e "New Version: $NEW_VERSION"
