// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoutineArgumentArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoutineArgumentArgs Empty = new RoutineArgumentArgs();

    /**
     * Defaults to FIXED_TYPE.
     * Default value is `FIXED_TYPE`.
     * Possible values are `FIXED_TYPE` and `ANY_TYPE`.
     * 
     */
    @InputImport(name="argumentKind")
      private final @Nullable Input<String> argumentKind;

    public Input<String> getArgumentKind() {
        return this.argumentKind == null ? Input.empty() : this.argumentKind;
    }

    /**
     * A JSON schema for the data type. Required unless argumentKind = ANY_TYPE.
     * ~>**NOTE**: Because this field expects a JSON string, any changes to the string
     * will create a diff, even if the JSON itself hasn't changed. If the API returns
     * a different value for the same schema, e.g. it switched the order of values
     * or replaced STRUCT field type with RECORD field type, we currently cannot
     * suppress the recurring diff this causes. As a workaround, we recommend using
     * the schema as returned by the API.
     * 
     */
    @InputImport(name="dataType")
      private final @Nullable Input<String> dataType;

    public Input<String> getDataType() {
        return this.dataType == null ? Input.empty() : this.dataType;
    }

    /**
     * Specifies whether the argument is input or output. Can be set for procedures only.
     * Possible values are `IN`, `OUT`, and `INOUT`.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The name of this argument. Can be absent for function return argument.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public RoutineArgumentArgs(
        @Nullable Input<String> argumentKind,
        @Nullable Input<String> dataType,
        @Nullable Input<String> mode,
        @Nullable Input<String> name) {
        this.argumentKind = argumentKind;
        this.dataType = dataType;
        this.mode = mode;
        this.name = name;
    }

    private RoutineArgumentArgs() {
        this.argumentKind = Input.empty();
        this.dataType = Input.empty();
        this.mode = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutineArgumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> argumentKind;
        private @Nullable Input<String> dataType;
        private @Nullable Input<String> mode;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutineArgumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.argumentKind = defaults.argumentKind;
    	      this.dataType = defaults.dataType;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
        }

        public Builder setArgumentKind(@Nullable Input<String> argumentKind) {
            this.argumentKind = argumentKind;
            return this;
        }

        public Builder setArgumentKind(@Nullable String argumentKind) {
            this.argumentKind = Input.ofNullable(argumentKind);
            return this;
        }

        public Builder setDataType(@Nullable Input<String> dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setDataType(@Nullable String dataType) {
            this.dataType = Input.ofNullable(dataType);
            return this;
        }

        public Builder setMode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public RoutineArgumentArgs build() {
            return new RoutineArgumentArgs(argumentKind, dataType, mode, name);
        }
    }
}
