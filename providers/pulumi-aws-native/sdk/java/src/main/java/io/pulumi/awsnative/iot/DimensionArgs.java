// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.enums.DimensionType;
import io.pulumi.awsnative.iot.inputs.DimensionTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DimensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DimensionArgs Empty = new DimensionArgs();

    /**
     * A unique identifier for the dimension.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies the value or list of values for the dimension.
     * 
     */
    @InputImport(name="stringValues", required=true)
      private final Input<List<String>> stringValues;

    public Input<List<String>> getStringValues() {
        return this.stringValues;
    }

    /**
     * Metadata that can be used to manage the dimension.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<DimensionTagArgs>> tags;

    public Input<List<DimensionTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Specifies the type of the dimension.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<DimensionType> type;

    public Input<DimensionType> getType() {
        return this.type;
    }

    public DimensionArgs(
        @Nullable Input<String> name,
        Input<List<String>> stringValues,
        @Nullable Input<List<DimensionTagArgs>> tags,
        Input<DimensionType> type) {
        this.name = name;
        this.stringValues = Objects.requireNonNull(stringValues, "expected parameter 'stringValues' to be non-null");
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DimensionArgs() {
        this.name = Input.empty();
        this.stringValues = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DimensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private Input<List<String>> stringValues;
        private @Nullable Input<List<DimensionTagArgs>> tags;
        private Input<DimensionType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DimensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.stringValues = defaults.stringValues;
    	      this.tags = defaults.tags;
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

        public Builder setStringValues(Input<List<String>> stringValues) {
            this.stringValues = Objects.requireNonNull(stringValues);
            return this;
        }

        public Builder setStringValues(List<String> stringValues) {
            this.stringValues = Input.of(Objects.requireNonNull(stringValues));
            return this;
        }

        public Builder setTags(@Nullable Input<List<DimensionTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DimensionTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setType(Input<DimensionType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(DimensionType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public DimensionArgs build() {
            return new DimensionArgs(name, stringValues, tags, type);
        }
    }
}
