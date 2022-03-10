// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProjectServiceCatalogProvisioningDetailsProvisioningParameter {
    /**
     * The key that identifies a provisioning parameter.
     * 
     */
    private final String key;
    /**
     * The value of the provisioning parameter.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private ProjectServiceCatalogProvisioningDetailsProvisioningParameter(
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * The key that identifies a provisioning parameter.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * The value of the provisioning parameter.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectServiceCatalogProvisioningDetailsProvisioningParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectServiceCatalogProvisioningDetailsProvisioningParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ProjectServiceCatalogProvisioningDetailsProvisioningParameter build() {
            return new ProjectServiceCatalogProvisioningDetailsProvisioningParameter(key, value);
        }
    }
}
