// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.AndroidAppInfoResponse;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.AndroidInstrumentationTestResponse;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.AndroidRoboTestResponse;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.AndroidTestLoopResponse;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.DurationResponse;
import java.util.Objects;


/**
 * An Android mobile test specification.
 * 
 */
public final class AndroidTestResponse extends io.pulumi.resources.InvokeArgs {

    public static final AndroidTestResponse Empty = new AndroidTestResponse();

    /**
     * Information about the application under test.
     * 
     */
    @Import(name="androidAppInfo", required=true)
      private final AndroidAppInfoResponse androidAppInfo;

    public AndroidAppInfoResponse getAndroidAppInfo() {
        return this.androidAppInfo;
    }

    /**
     * An Android instrumentation test.
     * 
     */
    @Import(name="androidInstrumentationTest", required=true)
      private final AndroidInstrumentationTestResponse androidInstrumentationTest;

    public AndroidInstrumentationTestResponse getAndroidInstrumentationTest() {
        return this.androidInstrumentationTest;
    }

    /**
     * An Android robo test.
     * 
     */
    @Import(name="androidRoboTest", required=true)
      private final AndroidRoboTestResponse androidRoboTest;

    public AndroidRoboTestResponse getAndroidRoboTest() {
        return this.androidRoboTest;
    }

    /**
     * An Android test loop.
     * 
     */
    @Import(name="androidTestLoop", required=true)
      private final AndroidTestLoopResponse androidTestLoop;

    public AndroidTestLoopResponse getAndroidTestLoop() {
        return this.androidTestLoop;
    }

    /**
     * Max time a test is allowed to run before it is automatically cancelled.
     * 
     */
    @Import(name="testTimeout", required=true)
      private final DurationResponse testTimeout;

    public DurationResponse getTestTimeout() {
        return this.testTimeout;
    }

    public AndroidTestResponse(
        AndroidAppInfoResponse androidAppInfo,
        AndroidInstrumentationTestResponse androidInstrumentationTest,
        AndroidRoboTestResponse androidRoboTest,
        AndroidTestLoopResponse androidTestLoop,
        DurationResponse testTimeout) {
        this.androidAppInfo = Objects.requireNonNull(androidAppInfo, "expected parameter 'androidAppInfo' to be non-null");
        this.androidInstrumentationTest = Objects.requireNonNull(androidInstrumentationTest, "expected parameter 'androidInstrumentationTest' to be non-null");
        this.androidRoboTest = Objects.requireNonNull(androidRoboTest, "expected parameter 'androidRoboTest' to be non-null");
        this.androidTestLoop = Objects.requireNonNull(androidTestLoop, "expected parameter 'androidTestLoop' to be non-null");
        this.testTimeout = Objects.requireNonNull(testTimeout, "expected parameter 'testTimeout' to be non-null");
    }

    private AndroidTestResponse() {
        this.androidAppInfo = null;
        this.androidInstrumentationTest = null;
        this.androidRoboTest = null;
        this.androidTestLoop = null;
        this.testTimeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidAppInfoResponse androidAppInfo;
        private AndroidInstrumentationTestResponse androidInstrumentationTest;
        private AndroidRoboTestResponse androidRoboTest;
        private AndroidTestLoopResponse androidTestLoop;
        private DurationResponse testTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidAppInfo = defaults.androidAppInfo;
    	      this.androidInstrumentationTest = defaults.androidInstrumentationTest;
    	      this.androidRoboTest = defaults.androidRoboTest;
    	      this.androidTestLoop = defaults.androidTestLoop;
    	      this.testTimeout = defaults.testTimeout;
        }

        public Builder androidAppInfo(AndroidAppInfoResponse androidAppInfo) {
            this.androidAppInfo = Objects.requireNonNull(androidAppInfo);
            return this;
        }
        public Builder androidInstrumentationTest(AndroidInstrumentationTestResponse androidInstrumentationTest) {
            this.androidInstrumentationTest = Objects.requireNonNull(androidInstrumentationTest);
            return this;
        }
        public Builder androidRoboTest(AndroidRoboTestResponse androidRoboTest) {
            this.androidRoboTest = Objects.requireNonNull(androidRoboTest);
            return this;
        }
        public Builder androidTestLoop(AndroidTestLoopResponse androidTestLoop) {
            this.androidTestLoop = Objects.requireNonNull(androidTestLoop);
            return this;
        }
        public Builder testTimeout(DurationResponse testTimeout) {
            this.testTimeout = Objects.requireNonNull(testTimeout);
            return this;
        }        public AndroidTestResponse build() {
            return new AndroidTestResponse(androidAppInfo, androidInstrumentationTest, androidRoboTest, androidTestLoop, testTimeout);
        }
    }
}
