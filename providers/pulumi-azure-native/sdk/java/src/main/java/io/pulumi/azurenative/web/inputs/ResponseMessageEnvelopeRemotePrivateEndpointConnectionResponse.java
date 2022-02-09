// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ArmPlanResponse;
import io.pulumi.azurenative.web.inputs.ErrorEntityResponse;
import io.pulumi.azurenative.web.inputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.web.inputs.RemotePrivateEndpointConnectionResponse;
import io.pulumi.azurenative.web.inputs.SkuDescriptionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse Empty = new ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse();

    @InputImport(name="error")
    private final @Nullable ErrorEntityResponse error;

    public Optional<ErrorEntityResponse> getError() {
        return this.error == null ? Optional.empty() : Optional.ofNullable(this.error);
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="identity")
    private final @Nullable ManagedServiceIdentityResponse identity;

    public Optional<ManagedServiceIdentityResponse> getIdentity() {
        return this.identity == null ? Optional.empty() : Optional.ofNullable(this.identity);
    }

    @InputImport(name="location")
    private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="plan")
    private final @Nullable ArmPlanResponse plan;

    public Optional<ArmPlanResponse> getPlan() {
        return this.plan == null ? Optional.empty() : Optional.ofNullable(this.plan);
    }

    @InputImport(name="properties")
    private final @Nullable RemotePrivateEndpointConnectionResponse properties;

    public Optional<RemotePrivateEndpointConnectionResponse> getProperties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    @InputImport(name="sku")
    private final @Nullable SkuDescriptionResponse sku;

    public Optional<SkuDescriptionResponse> getSku() {
        return this.sku == null ? Optional.empty() : Optional.ofNullable(this.sku);
    }

    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    @InputImport(name="zones")
    private final @Nullable List<String> zones;

    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse(
        @Nullable ErrorEntityResponse error,
        @Nullable String id,
        @Nullable ManagedServiceIdentityResponse identity,
        @Nullable String location,
        @Nullable String name,
        @Nullable ArmPlanResponse plan,
        @Nullable RemotePrivateEndpointConnectionResponse properties,
        @Nullable SkuDescriptionResponse sku,
        @Nullable String status,
        @Nullable Map<String,String> tags,
        @Nullable String type,
        @Nullable List<String> zones) {
        this.error = error;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.plan = plan;
        this.properties = properties;
        this.sku = sku;
        this.status = status;
        this.tags = tags;
        this.type = type;
        this.zones = zones;
    }

    private ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse() {
        this.error = null;
        this.id = null;
        this.identity = null;
        this.location = null;
        this.name = null;
        this.plan = null;
        this.properties = null;
        this.sku = null;
        this.status = null;
        this.tags = Map.of();
        this.type = null;
        this.zones = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ErrorEntityResponse error;
        private @Nullable String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private @Nullable String location;
        private @Nullable String name;
        private @Nullable ArmPlanResponse plan;
        private @Nullable RemotePrivateEndpointConnectionResponse properties;
        private @Nullable SkuDescriptionResponse sku;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        private @Nullable String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder setError(@Nullable ErrorEntityResponse error) {
            this.error = error;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPlan(@Nullable ArmPlanResponse plan) {
            this.plan = plan;
            return this;
        }

        public Builder setProperties(@Nullable RemotePrivateEndpointConnectionResponse properties) {
            this.properties = properties;
            return this;
        }

        public Builder setSku(@Nullable SkuDescriptionResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }

        public ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse build() {
            return new ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse(error, id, identity, location, name, plan, properties, sku, status, tags, type, zones);
        }
    }
}
