// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CapacityReservationGroupInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceReadOnlyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCapacityReservationGroupResult {
    private final List<SubResourceReadOnlyResponse> capacityReservations;
    private final String id;
    private final CapacityReservationGroupInstanceViewResponse instanceView;
    private final String location;
    private final String name;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final List<SubResourceReadOnlyResponse> virtualMachinesAssociated;
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"capacityReservations","id","instanceView","location","name","tags","type","virtualMachinesAssociated","zones"})
    private GetCapacityReservationGroupResult(
        List<SubResourceReadOnlyResponse> capacityReservations,
        String id,
        CapacityReservationGroupInstanceViewResponse instanceView,
        String location,
        String name,
        @Nullable Map<String,String> tags,
        String type,
        List<SubResourceReadOnlyResponse> virtualMachinesAssociated,
        @Nullable List<String> zones) {
        this.capacityReservations = Objects.requireNonNull(capacityReservations);
        this.id = Objects.requireNonNull(id);
        this.instanceView = Objects.requireNonNull(instanceView);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.virtualMachinesAssociated = Objects.requireNonNull(virtualMachinesAssociated);
        this.zones = zones;
    }

    public List<SubResourceReadOnlyResponse> getCapacityReservations() {
        return this.capacityReservations;
    }
    public String getId() {
        return this.id;
    }
    public CapacityReservationGroupInstanceViewResponse getInstanceView() {
        return this.instanceView;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
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

    public static Builder builder(GetCapacityReservationGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SubResourceReadOnlyResponse> capacityReservations;
        private String id;
        private CapacityReservationGroupInstanceViewResponse instanceView;
        private String location;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;
        private List<SubResourceReadOnlyResponse> virtualMachinesAssociated;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCapacityReservationGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservations = defaults.capacityReservations;
    	      this.id = defaults.id;
    	      this.instanceView = defaults.instanceView;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualMachinesAssociated = defaults.virtualMachinesAssociated;
    	      this.zones = defaults.zones;
        }

        public Builder setCapacityReservations(List<SubResourceReadOnlyResponse> capacityReservations) {
            this.capacityReservations = Objects.requireNonNull(capacityReservations);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceView(CapacityReservationGroupInstanceViewResponse instanceView) {
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

        public GetCapacityReservationGroupResult build() {
            return new GetCapacityReservationGroupResult(capacityReservations, id, instanceView, location, name, tags, type, virtualMachinesAssociated, zones);
        }
    }
}
