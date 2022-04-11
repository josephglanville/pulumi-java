// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A (sub) field of a type.
 * 
 */
public final class FieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldArgs Empty = new FieldArgs();

    /**
     * The maximum number of times this field can be repeated. 0 or -1 means unbounded.
     * 
     */
    @Import(name="maxOccurs")
      private final @Nullable Output<Integer> maxOccurs;

    public Output<Integer> getMaxOccurs() {
        return this.maxOccurs == null ? Codegen.empty() : this.maxOccurs;
    }

    /**
     * The minimum number of times this field must be present/repeated.
     * 
     */
    @Import(name="minOccurs")
      private final @Nullable Output<Integer> minOccurs;

    public Output<Integer> getMinOccurs() {
        return this.minOccurs == null ? Codegen.empty() : this.minOccurs;
    }

    /**
     * The name of the field. For example, "PID-1" or just "1".
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The HL7v2 table this field refers to. For example, PID-15 (Patient's Primary Language) usually refers to table "0296".
     * 
     */
    @Import(name="table")
      private final @Nullable Output<String> table;

    public Output<String> getTable() {
        return this.table == null ? Codegen.empty() : this.table;
    }

    /**
     * The type of this field. A Type with this name must be defined in an Hl7TypesConfig.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public FieldArgs(
        @Nullable Output<Integer> maxOccurs,
        @Nullable Output<Integer> minOccurs,
        @Nullable Output<String> name,
        @Nullable Output<String> table,
        @Nullable Output<String> type) {
        this.maxOccurs = maxOccurs;
        this.minOccurs = minOccurs;
        this.name = name;
        this.table = table;
        this.type = type;
    }

    private FieldArgs() {
        this.maxOccurs = Codegen.empty();
        this.minOccurs = Codegen.empty();
        this.name = Codegen.empty();
        this.table = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxOccurs;
        private @Nullable Output<Integer> minOccurs;
        private @Nullable Output<String> name;
        private @Nullable Output<String> table;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxOccurs = defaults.maxOccurs;
    	      this.minOccurs = defaults.minOccurs;
    	      this.name = defaults.name;
    	      this.table = defaults.table;
    	      this.type = defaults.type;
        }

        public Builder maxOccurs(@Nullable Output<Integer> maxOccurs) {
            this.maxOccurs = maxOccurs;
            return this;
        }
        public Builder maxOccurs(@Nullable Integer maxOccurs) {
            this.maxOccurs = Codegen.ofNullable(maxOccurs);
            return this;
        }
        public Builder minOccurs(@Nullable Output<Integer> minOccurs) {
            this.minOccurs = minOccurs;
            return this;
        }
        public Builder minOccurs(@Nullable Integer minOccurs) {
            this.minOccurs = Codegen.ofNullable(minOccurs);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder table(@Nullable Output<String> table) {
            this.table = table;
            return this;
        }
        public Builder table(@Nullable String table) {
            this.table = Codegen.ofNullable(table);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public FieldArgs build() {
            return new FieldArgs(maxOccurs, minOccurs, name, table, type);
        }
    }
}
