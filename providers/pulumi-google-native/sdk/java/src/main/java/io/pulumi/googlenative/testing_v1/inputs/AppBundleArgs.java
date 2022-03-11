// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.FileReferenceArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Android App Bundle file format, containing a BundleConfig.pb file, a base module directory, zero or more dynamic feature module directories. See https://developer.android.com/guide/app-bundle/build for guidance on building App Bundles.
 * 
 */
public final class AppBundleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppBundleArgs Empty = new AppBundleArgs();

    /**
     * .aab file representing the app bundle under test.
     * 
     */
    @InputImport(name="bundleLocation")
      private final @Nullable Output<FileReferenceArgs> bundleLocation;

    public Output<FileReferenceArgs> getBundleLocation() {
        return this.bundleLocation == null ? Output.empty() : this.bundleLocation;
    }

    public AppBundleArgs(@Nullable Output<FileReferenceArgs> bundleLocation) {
        this.bundleLocation = bundleLocation;
    }

    private AppBundleArgs() {
        this.bundleLocation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppBundleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FileReferenceArgs> bundleLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(AppBundleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleLocation = defaults.bundleLocation;
        }

        public Builder bundleLocation(@Nullable Output<FileReferenceArgs> bundleLocation) {
            this.bundleLocation = bundleLocation;
            return this;
        }

        public Builder bundleLocation(@Nullable FileReferenceArgs bundleLocation) {
            this.bundleLocation = Output.ofNullable(bundleLocation);
            return this;
        }
        public AppBundleArgs build() {
            return new AppBundleArgs(bundleLocation);
        }
    }
}
