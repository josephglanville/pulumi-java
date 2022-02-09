// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTestResultVideoDownloadURLArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTestResultVideoDownloadURLArgs Empty = new GetTestResultVideoDownloadURLArgs();

    @InputImport(name="packageName", required=true)
    private final String packageName;

    public String getPackageName() {
        return this.packageName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="testBaseAccountName", required=true)
    private final String testBaseAccountName;

    public String getTestBaseAccountName() {
        return this.testBaseAccountName;
    }

    @InputImport(name="testResultName", required=true)
    private final String testResultName;

    public String getTestResultName() {
        return this.testResultName;
    }

    public GetTestResultVideoDownloadURLArgs(
        String packageName,
        String resourceGroupName,
        String testBaseAccountName,
        String testResultName) {
        this.packageName = Objects.requireNonNull(packageName, "expected parameter 'packageName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
        this.testResultName = Objects.requireNonNull(testResultName, "expected parameter 'testResultName' to be non-null");
    }

    private GetTestResultVideoDownloadURLArgs() {
        this.packageName = null;
        this.resourceGroupName = null;
        this.testBaseAccountName = null;
        this.testResultName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestResultVideoDownloadURLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String packageName;
        private String resourceGroupName;
        private String testBaseAccountName;
        private String testResultName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTestResultVideoDownloadURLArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packageName = defaults.packageName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.testBaseAccountName = defaults.testBaseAccountName;
    	      this.testResultName = defaults.testResultName;
        }

        public Builder setPackageName(String packageName) {
            this.packageName = Objects.requireNonNull(packageName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTestBaseAccountName(String testBaseAccountName) {
            this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName);
            return this;
        }

        public Builder setTestResultName(String testResultName) {
            this.testResultName = Objects.requireNonNull(testResultName);
            return this;
        }

        public GetTestResultVideoDownloadURLArgs build() {
            return new GetTestResultVideoDownloadURLArgs(packageName, resourceGroupName, testBaseAccountName, testResultName);
        }
    }
}
