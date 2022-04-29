// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentDeployArtifactOverrideArgumentsItem {
    /**
     * @return The OCID of the artifact to which this parameter applies.
     * 
     */
    private final @Nullable String deployArtifactId;
    /**
     * @return Name of the parameter (case-sensitive).
     * 
     */
    private final @Nullable String name;
    /**
     * @return value of the argument.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private DeploymentDeployArtifactOverrideArgumentsItem(
        @CustomType.Parameter("deployArtifactId") @Nullable String deployArtifactId,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("value") @Nullable String value) {
        this.deployArtifactId = deployArtifactId;
        this.name = name;
        this.value = value;
    }

    /**
     * @return The OCID of the artifact to which this parameter applies.
     * 
     */
    public Optional<String> deployArtifactId() {
        return Optional.ofNullable(this.deployArtifactId);
    }
    /**
     * @return Name of the parameter (case-sensitive).
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return value of the argument.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentDeployArtifactOverrideArgumentsItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deployArtifactId;
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentDeployArtifactOverrideArgumentsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployArtifactId = defaults.deployArtifactId;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder deployArtifactId(@Nullable String deployArtifactId) {
            this.deployArtifactId = deployArtifactId;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public DeploymentDeployArtifactOverrideArgumentsItem build() {
            return new DeploymentDeployArtifactOverrideArgumentsItem(deployArtifactId, name, value);
        }
    }
}
