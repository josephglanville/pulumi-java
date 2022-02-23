// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.PivotTypeType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Each pivot must contain a 'type' and 'name'.
 * 
 */
public final class PivotPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PivotPropertiesArgs Empty = new PivotPropertiesArgs();

    /**
     * Data field to show in view.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Data type to show in view.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<Either<String,PivotTypeType>> type;

    public Input<Either<String,PivotTypeType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public PivotPropertiesArgs(
        @Nullable Input<String> name,
        @Nullable Input<Either<String,PivotTypeType>> type) {
        this.name = name;
        this.type = type;
    }

    private PivotPropertiesArgs() {
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PivotPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<Either<String,PivotTypeType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PivotPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,PivotTypeType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,PivotTypeType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public PivotPropertiesArgs build() {
            return new PivotPropertiesArgs(name, type);
        }
    }
}
