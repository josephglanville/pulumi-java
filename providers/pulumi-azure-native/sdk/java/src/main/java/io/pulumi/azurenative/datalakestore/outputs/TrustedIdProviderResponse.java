// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TrustedIdProviderResponse {
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The URL of this trusted identity provider.
     * 
     */
    private final String idProvider;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private TrustedIdProviderResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("idProvider") String idProvider,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.idProvider = idProvider;
        this.name = name;
        this.type = type;
    }

    /**
     * The resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The URL of this trusted identity provider.
     * 
    */
    public String getIdProvider() {
        return this.idProvider;
    }
    /**
     * The resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrustedIdProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String idProvider;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TrustedIdProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.idProvider = defaults.idProvider;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder idProvider(String idProvider) {
            this.idProvider = Objects.requireNonNull(idProvider);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public TrustedIdProviderResponse build() {
            return new TrustedIdProviderResponse(id, idProvider, name, type);
        }
    }
}
