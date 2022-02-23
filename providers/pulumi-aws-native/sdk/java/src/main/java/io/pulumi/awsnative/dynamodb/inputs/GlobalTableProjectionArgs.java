// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalTableProjectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalTableProjectionArgs Empty = new GlobalTableProjectionArgs();

    @InputImport(name="nonKeyAttributes")
      private final @Nullable Input<List<String>> nonKeyAttributes;

    public Input<List<String>> getNonKeyAttributes() {
        return this.nonKeyAttributes == null ? Input.empty() : this.nonKeyAttributes;
    }

    @InputImport(name="projectionType")
      private final @Nullable Input<String> projectionType;

    public Input<String> getProjectionType() {
        return this.projectionType == null ? Input.empty() : this.projectionType;
    }

    public GlobalTableProjectionArgs(
        @Nullable Input<List<String>> nonKeyAttributes,
        @Nullable Input<String> projectionType) {
        this.nonKeyAttributes = nonKeyAttributes;
        this.projectionType = projectionType;
    }

    private GlobalTableProjectionArgs() {
        this.nonKeyAttributes = Input.empty();
        this.projectionType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableProjectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> nonKeyAttributes;
        private @Nullable Input<String> projectionType;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableProjectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonKeyAttributes = defaults.nonKeyAttributes;
    	      this.projectionType = defaults.projectionType;
        }

        public Builder setNonKeyAttributes(@Nullable Input<List<String>> nonKeyAttributes) {
            this.nonKeyAttributes = nonKeyAttributes;
            return this;
        }

        public Builder setNonKeyAttributes(@Nullable List<String> nonKeyAttributes) {
            this.nonKeyAttributes = Input.ofNullable(nonKeyAttributes);
            return this;
        }

        public Builder setProjectionType(@Nullable Input<String> projectionType) {
            this.projectionType = projectionType;
            return this;
        }

        public Builder setProjectionType(@Nullable String projectionType) {
            this.projectionType = Input.ofNullable(projectionType);
            return this;
        }
        public GlobalTableProjectionArgs build() {
            return new GlobalTableProjectionArgs(nonKeyAttributes, projectionType);
        }
    }
}
