// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationInstanceManifestOverridesPayloadArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationInstanceManifestOverridesPayloadArgs Empty = new ApplicationInstanceManifestOverridesPayloadArgs();

    @Import(name="payloadData")
      private final @Nullable Output<String> payloadData;

    public Output<String> getPayloadData() {
        return this.payloadData == null ? Codegen.empty() : this.payloadData;
    }

    public ApplicationInstanceManifestOverridesPayloadArgs(@Nullable Output<String> payloadData) {
        this.payloadData = payloadData;
    }

    private ApplicationInstanceManifestOverridesPayloadArgs() {
        this.payloadData = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInstanceManifestOverridesPayloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> payloadData;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInstanceManifestOverridesPayloadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payloadData = defaults.payloadData;
        }

        public Builder payloadData(@Nullable Output<String> payloadData) {
            this.payloadData = payloadData;
            return this;
        }
        public Builder payloadData(@Nullable String payloadData) {
            this.payloadData = Codegen.ofNullable(payloadData);
            return this;
        }        public ApplicationInstanceManifestOverridesPayloadArgs build() {
            return new ApplicationInstanceManifestOverridesPayloadArgs(payloadData);
        }
    }
}
