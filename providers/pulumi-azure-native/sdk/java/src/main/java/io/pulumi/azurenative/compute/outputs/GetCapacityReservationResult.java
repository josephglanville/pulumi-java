// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CapacityReservationInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.SkuResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceReadOnlyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCapacityReservationResult {
    private final String id;
    private final CapacityReservationInstanceViewResponse instanceView;
    private final String location;
    private final String name;
    private final String provisioningState;
    private final String provisioningTime;
    private final String reservationId;
    private final SkuResponse sku;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final List<SubResourceReadOnlyResponse> virtualMachinesAssociated;
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"id","instanceView","location","name","provisioningState","provisioningTime","reservationId","sku","tags","type","virtualMachinesAssociated","zones"})
    private GetCapacityReservationResult(
        String id,
        CapacityReservationInstanceViewResponse instanceView,
        String location,
        String name,
        String provisioningState,
        String provisioningTime,
        String reservationId,
        SkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        List<SubResourceReadOnlyResponse> virtualMachinesAssociated,
        @Nullable List<String> zones) {
        this.id = Objects.requireNonNull(id);
        this.instanceView = Objects.requireNonNull(instanceView);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.provisioningTime = Objects.requireNonNull(provisioningTime);
        this.reservationId = Objects.requireNonNull(reservationId);
        this.sku = Objects.requireNonNull(sku);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.virtualMachinesAssociated = Objects.requireNonNull(virtualMachinesAssociated);
        this.zones = zones;
    }

    public String getId() {
        return this.id;
    }
    public CapacityReservationInstanceViewResponse getInstanceView() {
        return this.instanceView;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getProvisioningTime() {
        return this.provisioningTime;
    }
    public String getReservationId() {
        return this.reservationId;
    }
    public SkuResponse getSku() {
        return this.sku;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public List<SubResourceReadOnlyResponse> getVirtualMachinesAssociated() {
        return this.virtualMachinesAssociated;
    }
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapacityReservationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private CapacityReservationInstanceViewResponse instanceView;
        private String location;
        private String name;
        private String provisioningState;
        private String provisioningTime;
        private String reservationId;
        private SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private List<SubResourceReadOnlyResponse> virtualMachinesAssociated;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCapacityReservationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceView = defaults.instanceView;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.provisioningTime = defaults.provisioningTime;
    	      this.reservationId = defaults.reservationId;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualMachinesAssociated = defaults.virtualMachinesAssociated;
    	      this.zones = defaults.zones;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceView(CapacityReservationInstanceViewResponse instanceView) {
            this.instanceView = Objects.requireNonNull(instanceView);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setProvisioningTime(String provisioningTime) {
            this.provisioningTime = Objects.requireNonNull(provisioningTime);
            return this;
        }

        public Builder setReservationId(String reservationId) {
            this.reservationId = Objects.requireNonNull(reservationId);
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualMachinesAssociated(List<SubResourceReadOnlyResponse> virtualMachinesAssociated) {
            this.virtualMachinesAssociated = Objects.requireNonNull(virtualMachinesAssociated);
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }

        public GetCapacityReservationResult build() {
            return new GetCapacityReservationResult(id, instanceView, location, name, provisioningState, provisioningTime, reservationId, sku, tags, type, virtualMachinesAssociated, zones);
        }
    }
}
