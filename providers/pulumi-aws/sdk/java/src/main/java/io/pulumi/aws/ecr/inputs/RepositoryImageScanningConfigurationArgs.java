// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;


public final class RepositoryImageScanningConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryImageScanningConfigurationArgs Empty = new RepositoryImageScanningConfigurationArgs();

    /**
     * Indicates whether images are scanned after being pushed to the repository (true) or not scanned (false).
     * 
     */
    @Import(name="scanOnPush", required=true)
      private final Output<Boolean> scanOnPush;

    public Output<Boolean> getScanOnPush() {
        return this.scanOnPush;
    }

    public RepositoryImageScanningConfigurationArgs(Output<Boolean> scanOnPush) {
        this.scanOnPush = Objects.requireNonNull(scanOnPush, "expected parameter 'scanOnPush' to be non-null");
    }

    private RepositoryImageScanningConfigurationArgs() {
        this.scanOnPush = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryImageScanningConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> scanOnPush;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryImageScanningConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scanOnPush = defaults.scanOnPush;
        }

        public Builder scanOnPush(Output<Boolean> scanOnPush) {
            this.scanOnPush = Objects.requireNonNull(scanOnPush);
            return this;
        }
        public Builder scanOnPush(Boolean scanOnPush) {
            this.scanOnPush = Output.of(Objects.requireNonNull(scanOnPush));
            return this;
        }        public RepositoryImageScanningConfigurationArgs build() {
            return new RepositoryImageScanningConfigurationArgs(scanOnPush);
        }
    }
}
