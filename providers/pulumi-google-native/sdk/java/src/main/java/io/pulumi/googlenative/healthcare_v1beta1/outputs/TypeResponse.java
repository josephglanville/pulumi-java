// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.FieldResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TypeResponse {
    /**
     * The (sub) fields this type has (if not primitive).
     * 
     */
    private final List<FieldResponse> fields;
    /**
     * The name of this type. This would be the segment or datatype name. For example, "PID" or "XPN".
     * 
     */
    private final String name;
    /**
     * If this is a primitive type then this field is the type of the primitive For example, STRING. Leave unspecified for composite types.
     * 
     */
    private final String primitive;

    @CustomType.Constructor
    private TypeResponse(
        @CustomType.Parameter("fields") List<FieldResponse> fields,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("primitive") String primitive) {
        this.fields = fields;
        this.name = name;
        this.primitive = primitive;
    }

    /**
     * The (sub) fields this type has (if not primitive).
     * 
    */
    public List<FieldResponse> getFields() {
        return this.fields;
    }
    /**
     * The name of this type. This would be the segment or datatype name. For example, "PID" or "XPN".
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * If this is a primitive type then this field is the type of the primitive For example, STRING. Leave unspecified for composite types.
     * 
    */
    public String getPrimitive() {
        return this.primitive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FieldResponse> fields;
        private String name;
        private String primitive;

        public Builder() {
    	      // Empty
        }

        public Builder(TypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.primitive = defaults.primitive;
        }

        public Builder fields(List<FieldResponse> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public Builder fields(FieldResponse... fields) {
            return fields(List.of(fields));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder primitive(String primitive) {
            this.primitive = Objects.requireNonNull(primitive);
            return this;
        }        public TypeResponse build() {
            return new TypeResponse(fields, name, primitive);
        }
    }
}
