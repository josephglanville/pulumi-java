// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicyResult {
    /**
     * Format of the policyContent.
     * 
     */
    private final @Nullable String format;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;
    /**
     * Contents of the Policy as defined by the format.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetPolicyResult(
        @CustomType.Parameter("format") @Nullable String format,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.format = format;
        this.id = id;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /**
     * Format of the policyContent.
     * 
    */
    public Optional<String> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type for API Management resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Contents of the Policy as defined by the format.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String format;
        private String id;
        private String name;
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetPolicyResult build() {
            return new GetPolicyResult(format, id, name, type, value);
        }
    }
}
