// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.testing_v1.inputs.AppBundleResponse;
import io.pulumi.googlenative.testing_v1.inputs.FileReferenceResponse;
import io.pulumi.googlenative.testing_v1.inputs.ShardingOptionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A test of an Android application that can control an Android component independently of its normal lifecycle. Android instrumentation tests run an application APK and test APK inside the same process on a virtual or physical AndroidDevice. They also specify a test runner class, such as com.google.GoogleTestRunner, which can vary on the specific instrumentation framework chosen. See for more information on types of Android tests.
 * 
 */
public final class AndroidInstrumentationTestResponse extends io.pulumi.resources.InvokeArgs {

    public static final AndroidInstrumentationTestResponse Empty = new AndroidInstrumentationTestResponse();

    /**
     * The APK for the application under test.
     * 
     */
    @Import(name="appApk", required=true)
      private final FileReferenceResponse appApk;

    public FileReferenceResponse getAppApk() {
        return this.appApk;
    }

    /**
     * A multi-apk app bundle for the application under test.
     * 
     */
    @Import(name="appBundle", required=true)
      private final AppBundleResponse appBundle;

    public AppBundleResponse getAppBundle() {
        return this.appBundle;
    }

    /**
     * The java package for the application under test. The default value is determined by examining the application's manifest.
     * 
     */
    @Import(name="appPackageId", required=true)
      private final String appPackageId;

    public String getAppPackageId() {
        return this.appPackageId;
    }

    /**
     * The option of whether running each test within its own invocation of instrumentation with Android Test Orchestrator or not. ** Orchestrator is only compatible with AndroidJUnitRunner version 1.1 or higher! ** Orchestrator offers the following benefits: - No shared state - Crashes are isolated - Logs are scoped per test See for more information about Android Test Orchestrator. If not set, the test will be run without the orchestrator.
     * 
     */
    @Import(name="orchestratorOption", required=true)
      private final String orchestratorOption;

    public String getOrchestratorOption() {
        return this.orchestratorOption;
    }

    /**
     * The option to run tests in multiple shards in parallel.
     * 
     */
    @Import(name="shardingOption", required=true)
      private final ShardingOptionResponse shardingOption;

    public ShardingOptionResponse getShardingOption() {
        return this.shardingOption;
    }

    /**
     * The APK containing the test code to be executed.
     * 
     */
    @Import(name="testApk", required=true)
      private final FileReferenceResponse testApk;

    public FileReferenceResponse getTestApk() {
        return this.testApk;
    }

    /**
     * The java package for the test to be executed. The default value is determined by examining the application's manifest.
     * 
     */
    @Import(name="testPackageId", required=true)
      private final String testPackageId;

    public String getTestPackageId() {
        return this.testPackageId;
    }

    /**
     * The InstrumentationTestRunner class. The default value is determined by examining the application's manifest.
     * 
     */
    @Import(name="testRunnerClass", required=true)
      private final String testRunnerClass;

    public String getTestRunnerClass() {
        return this.testRunnerClass;
    }

    /**
     * Each target must be fully qualified with the package name or class name, in one of these formats: - "package package_name" - "class package_name.class_name" - "class package_name.class_name#method_name" If empty, all targets in the module will be run.
     * 
     */
    @Import(name="testTargets", required=true)
      private final List<String> testTargets;

    public List<String> getTestTargets() {
        return this.testTargets;
    }

    public AndroidInstrumentationTestResponse(
        FileReferenceResponse appApk,
        AppBundleResponse appBundle,
        String appPackageId,
        String orchestratorOption,
        ShardingOptionResponse shardingOption,
        FileReferenceResponse testApk,
        String testPackageId,
        String testRunnerClass,
        List<String> testTargets) {
        this.appApk = Objects.requireNonNull(appApk, "expected parameter 'appApk' to be non-null");
        this.appBundle = Objects.requireNonNull(appBundle, "expected parameter 'appBundle' to be non-null");
        this.appPackageId = Objects.requireNonNull(appPackageId, "expected parameter 'appPackageId' to be non-null");
        this.orchestratorOption = Objects.requireNonNull(orchestratorOption, "expected parameter 'orchestratorOption' to be non-null");
        this.shardingOption = Objects.requireNonNull(shardingOption, "expected parameter 'shardingOption' to be non-null");
        this.testApk = Objects.requireNonNull(testApk, "expected parameter 'testApk' to be non-null");
        this.testPackageId = Objects.requireNonNull(testPackageId, "expected parameter 'testPackageId' to be non-null");
        this.testRunnerClass = Objects.requireNonNull(testRunnerClass, "expected parameter 'testRunnerClass' to be non-null");
        this.testTargets = Objects.requireNonNull(testTargets, "expected parameter 'testTargets' to be non-null");
    }

    private AndroidInstrumentationTestResponse() {
        this.appApk = null;
        this.appBundle = null;
        this.appPackageId = null;
        this.orchestratorOption = null;
        this.shardingOption = null;
        this.testApk = null;
        this.testPackageId = null;
        this.testRunnerClass = null;
        this.testTargets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidInstrumentationTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileReferenceResponse appApk;
        private AppBundleResponse appBundle;
        private String appPackageId;
        private String orchestratorOption;
        private ShardingOptionResponse shardingOption;
        private FileReferenceResponse testApk;
        private String testPackageId;
        private String testRunnerClass;
        private List<String> testTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidInstrumentationTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appApk = defaults.appApk;
    	      this.appBundle = defaults.appBundle;
    	      this.appPackageId = defaults.appPackageId;
    	      this.orchestratorOption = defaults.orchestratorOption;
    	      this.shardingOption = defaults.shardingOption;
    	      this.testApk = defaults.testApk;
    	      this.testPackageId = defaults.testPackageId;
    	      this.testRunnerClass = defaults.testRunnerClass;
    	      this.testTargets = defaults.testTargets;
        }

        public Builder appApk(FileReferenceResponse appApk) {
            this.appApk = Objects.requireNonNull(appApk);
            return this;
        }
        public Builder appBundle(AppBundleResponse appBundle) {
            this.appBundle = Objects.requireNonNull(appBundle);
            return this;
        }
        public Builder appPackageId(String appPackageId) {
            this.appPackageId = Objects.requireNonNull(appPackageId);
            return this;
        }
        public Builder orchestratorOption(String orchestratorOption) {
            this.orchestratorOption = Objects.requireNonNull(orchestratorOption);
            return this;
        }
        public Builder shardingOption(ShardingOptionResponse shardingOption) {
            this.shardingOption = Objects.requireNonNull(shardingOption);
            return this;
        }
        public Builder testApk(FileReferenceResponse testApk) {
            this.testApk = Objects.requireNonNull(testApk);
            return this;
        }
        public Builder testPackageId(String testPackageId) {
            this.testPackageId = Objects.requireNonNull(testPackageId);
            return this;
        }
        public Builder testRunnerClass(String testRunnerClass) {
            this.testRunnerClass = Objects.requireNonNull(testRunnerClass);
            return this;
        }
        public Builder testTargets(List<String> testTargets) {
            this.testTargets = Objects.requireNonNull(testTargets);
            return this;
        }
        public Builder testTargets(String... testTargets) {
            return testTargets(List.of(testTargets));
        }        public AndroidInstrumentationTestResponse build() {
            return new AndroidInstrumentationTestResponse(appApk, appBundle, appPackageId, orchestratorOption, shardingOption, testApk, testPackageId, testRunnerClass, testTargets);
        }
    }
}
