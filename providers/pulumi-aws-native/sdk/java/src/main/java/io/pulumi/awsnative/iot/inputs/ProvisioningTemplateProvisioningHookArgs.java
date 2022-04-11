// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProvisioningTemplateProvisioningHookArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProvisioningTemplateProvisioningHookArgs Empty = new ProvisioningTemplateProvisioningHookArgs();

    @Import(name="payloadVersion")
      private final @Nullable Output<String> payloadVersion;

    public Output<String> getPayloadVersion() {
        return this.payloadVersion == null ? Codegen.empty() : this.payloadVersion;
    }

    @Import(name="targetArn")
      private final @Nullable Output<String> targetArn;

    public Output<String> getTargetArn() {
        return this.targetArn == null ? Codegen.empty() : this.targetArn;
    }

    public ProvisioningTemplateProvisioningHookArgs(
        @Nullable Output<String> payloadVersion,
        @Nullable Output<String> targetArn) {
        this.payloadVersion = payloadVersion;
        this.targetArn = targetArn;
    }

    private ProvisioningTemplateProvisioningHookArgs() {
        this.payloadVersion = Codegen.empty();
        this.targetArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisioningTemplateProvisioningHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> payloadVersion;
        private @Nullable Output<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisioningTemplateProvisioningHookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payloadVersion = defaults.payloadVersion;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder payloadVersion(@Nullable Output<String> payloadVersion) {
            this.payloadVersion = payloadVersion;
            return this;
        }
        public Builder payloadVersion(@Nullable String payloadVersion) {
            this.payloadVersion = Codegen.ofNullable(payloadVersion);
            return this;
        }
        public Builder targetArn(@Nullable Output<String> targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public Builder targetArn(@Nullable String targetArn) {
            this.targetArn = Codegen.ofNullable(targetArn);
            return this;
        }        public ProvisioningTemplateProvisioningHookArgs build() {
            return new ProvisioningTemplateProvisioningHookArgs(payloadVersion, targetArn);
        }
    }
}
