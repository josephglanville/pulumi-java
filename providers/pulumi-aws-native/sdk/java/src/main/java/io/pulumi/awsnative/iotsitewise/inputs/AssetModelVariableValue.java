// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssetModelVariableValue extends io.pulumi.resources.InvokeArgs {

    public static final AssetModelVariableValue Empty = new AssetModelVariableValue();

    @Import(name="hierarchyLogicalId")
      private final @Nullable String hierarchyLogicalId;

    public Optional<String> getHierarchyLogicalId() {
        return this.hierarchyLogicalId == null ? Optional.empty() : Optional.ofNullable(this.hierarchyLogicalId);
    }

    @Import(name="propertyLogicalId", required=true)
      private final String propertyLogicalId;

    public String getPropertyLogicalId() {
        return this.propertyLogicalId;
    }

    public AssetModelVariableValue(
        @Nullable String hierarchyLogicalId,
        String propertyLogicalId) {
        this.hierarchyLogicalId = hierarchyLogicalId;
        this.propertyLogicalId = Objects.requireNonNull(propertyLogicalId, "expected parameter 'propertyLogicalId' to be non-null");
    }

    private AssetModelVariableValue() {
        this.hierarchyLogicalId = null;
        this.propertyLogicalId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelVariableValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hierarchyLogicalId;
        private String propertyLogicalId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelVariableValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hierarchyLogicalId = defaults.hierarchyLogicalId;
    	      this.propertyLogicalId = defaults.propertyLogicalId;
        }

        public Builder hierarchyLogicalId(@Nullable String hierarchyLogicalId) {
            this.hierarchyLogicalId = hierarchyLogicalId;
            return this;
        }
        public Builder propertyLogicalId(String propertyLogicalId) {
            this.propertyLogicalId = Objects.requireNonNull(propertyLogicalId);
            return this;
        }        public AssetModelVariableValue build() {
            return new AssetModelVariableValue(hierarchyLogicalId, propertyLogicalId);
        }
    }
}
