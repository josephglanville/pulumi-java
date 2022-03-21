// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase;

import io.pulumi.azurenative.testbase.inputs.TargetOSInfoArgs;
import io.pulumi.azurenative.testbase.inputs.TestArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackageArgs Empty = new PackageArgs();

    /**
     * Application name
     * 
     */
    @Import(name="applicationName", required=true)
      private final Output<String> applicationName;

    public Output<String> getApplicationName() {
        return this.applicationName;
    }

    /**
     * The file path of the package.
     * 
     */
    @Import(name="blobPath", required=true)
      private final Output<String> blobPath;

    public Output<String> getBlobPath() {
        return this.blobPath;
    }

    /**
     * The flighting ring for feature update.
     * 
     */
    @Import(name="flightingRing", required=true)
      private final Output<String> flightingRing;

    public Output<String> getFlightingRing() {
        return this.flightingRing;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The resource name of the Test Base Package.
     * 
     */
    @Import(name="packageName")
      private final @Nullable Output<String> packageName;

    public Output<String> getPackageName() {
        return this.packageName == null ? Output.empty() : this.packageName;
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Specifies the target OSs of specific OS Update types.
     * 
     */
    @Import(name="targetOSList", required=true)
      private final Output<List<TargetOSInfoArgs>> targetOSList;

    public Output<List<TargetOSInfoArgs>> getTargetOSList() {
        return this.targetOSList;
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @Import(name="testBaseAccountName", required=true)
      private final Output<String> testBaseAccountName;

    public Output<String> getTestBaseAccountName() {
        return this.testBaseAccountName;
    }

    /**
     * The detailed test information.
     * 
     */
    @Import(name="tests", required=true)
      private final Output<List<TestArgs>> tests;

    public Output<List<TestArgs>> getTests() {
        return this.tests;
    }

    /**
     * Application version
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> getVersion() {
        return this.version;
    }

    public PackageArgs(
        Output<String> applicationName,
        Output<String> blobPath,
        Output<String> flightingRing,
        @Nullable Output<String> location,
        @Nullable Output<String> packageName,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        Output<List<TargetOSInfoArgs>> targetOSList,
        Output<String> testBaseAccountName,
        Output<List<TestArgs>> tests,
        Output<String> version) {
        this.applicationName = Objects.requireNonNull(applicationName, "expected parameter 'applicationName' to be non-null");
        this.blobPath = Objects.requireNonNull(blobPath, "expected parameter 'blobPath' to be non-null");
        this.flightingRing = Objects.requireNonNull(flightingRing, "expected parameter 'flightingRing' to be non-null");
        this.location = location;
        this.packageName = packageName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.targetOSList = Objects.requireNonNull(targetOSList, "expected parameter 'targetOSList' to be non-null");
        this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
        this.tests = Objects.requireNonNull(tests, "expected parameter 'tests' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private PackageArgs() {
        this.applicationName = Output.empty();
        this.blobPath = Output.empty();
        this.flightingRing = Output.empty();
        this.location = Output.empty();
        this.packageName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
        this.targetOSList = Output.empty();
        this.testBaseAccountName = Output.empty();
        this.tests = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> applicationName;
        private Output<String> blobPath;
        private Output<String> flightingRing;
        private @Nullable Output<String> location;
        private @Nullable Output<String> packageName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private Output<List<TargetOSInfoArgs>> targetOSList;
        private Output<String> testBaseAccountName;
        private Output<List<TestArgs>> tests;
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.blobPath = defaults.blobPath;
    	      this.flightingRing = defaults.flightingRing;
    	      this.location = defaults.location;
    	      this.packageName = defaults.packageName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.targetOSList = defaults.targetOSList;
    	      this.testBaseAccountName = defaults.testBaseAccountName;
    	      this.tests = defaults.tests;
    	      this.version = defaults.version;
        }

        public Builder applicationName(Output<String> applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }
        public Builder applicationName(String applicationName) {
            this.applicationName = Output.of(Objects.requireNonNull(applicationName));
            return this;
        }
        public Builder blobPath(Output<String> blobPath) {
            this.blobPath = Objects.requireNonNull(blobPath);
            return this;
        }
        public Builder blobPath(String blobPath) {
            this.blobPath = Output.of(Objects.requireNonNull(blobPath));
            return this;
        }
        public Builder flightingRing(Output<String> flightingRing) {
            this.flightingRing = Objects.requireNonNull(flightingRing);
            return this;
        }
        public Builder flightingRing(String flightingRing) {
            this.flightingRing = Output.of(Objects.requireNonNull(flightingRing));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder packageName(@Nullable Output<String> packageName) {
            this.packageName = packageName;
            return this;
        }
        public Builder packageName(@Nullable String packageName) {
            this.packageName = Output.ofNullable(packageName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder targetOSList(Output<List<TargetOSInfoArgs>> targetOSList) {
            this.targetOSList = Objects.requireNonNull(targetOSList);
            return this;
        }
        public Builder targetOSList(List<TargetOSInfoArgs> targetOSList) {
            this.targetOSList = Output.of(Objects.requireNonNull(targetOSList));
            return this;
        }
        public Builder targetOSList(TargetOSInfoArgs... targetOSList) {
            return targetOSList(List.of(targetOSList));
        }
        public Builder testBaseAccountName(Output<String> testBaseAccountName) {
            this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName);
            return this;
        }
        public Builder testBaseAccountName(String testBaseAccountName) {
            this.testBaseAccountName = Output.of(Objects.requireNonNull(testBaseAccountName));
            return this;
        }
        public Builder tests(Output<List<TestArgs>> tests) {
            this.tests = Objects.requireNonNull(tests);
            return this;
        }
        public Builder tests(List<TestArgs> tests) {
            this.tests = Output.of(Objects.requireNonNull(tests));
            return this;
        }
        public Builder tests(TestArgs... tests) {
            return tests(List.of(tests));
        }
        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }        public PackageArgs build() {
            return new PackageArgs(applicationName, blobPath, flightingRing, location, packageName, resourceGroupName, tags, targetOSList, testBaseAccountName, tests, version);
        }
    }
}
