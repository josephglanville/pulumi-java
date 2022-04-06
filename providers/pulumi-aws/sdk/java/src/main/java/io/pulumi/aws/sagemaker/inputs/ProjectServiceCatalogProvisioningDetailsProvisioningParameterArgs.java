// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs Empty = new ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs();

    /**
     * The key that identifies a provisioning parameter.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * The value of the provisioning parameter.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs(
        Output<String> key,
        @Nullable Output<String> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = value;
    }

    private ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs() {
        this.key = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }        public ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs build() {
            return new ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs(key, value);
        }
    }
}