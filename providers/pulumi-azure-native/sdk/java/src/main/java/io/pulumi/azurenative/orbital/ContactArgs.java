// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital;

import io.pulumi.azurenative.orbital.inputs.ResourceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactArgs Empty = new ContactArgs();

    @InputImport(name="contactName")
    private final @Nullable Input<String> contactName;

    public Input<String> getContactName() {
        return this.contactName == null ? Input.empty() : this.contactName;
    }

    @InputImport(name="contactProfile", required=true)
    private final Input<ResourceReferenceArgs> contactProfile;

    public Input<ResourceReferenceArgs> getContactProfile() {
        return this.contactProfile;
    }

    @InputImport(name="groundStationName", required=true)
    private final Input<String> groundStationName;

    public Input<String> getGroundStationName() {
        return this.groundStationName;
    }

    @InputImport(name="reservationEndTime", required=true)
    private final Input<String> reservationEndTime;

    public Input<String> getReservationEndTime() {
        return this.reservationEndTime;
    }

    @InputImport(name="reservationStartTime", required=true)
    private final Input<String> reservationStartTime;

    public Input<String> getReservationStartTime() {
        return this.reservationStartTime;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="spacecraftName", required=true)
    private final Input<String> spacecraftName;

    public Input<String> getSpacecraftName() {
        return this.spacecraftName;
    }

    public ContactArgs(
        @Nullable Input<String> contactName,
        Input<ResourceReferenceArgs> contactProfile,
        Input<String> groundStationName,
        Input<String> reservationEndTime,
        Input<String> reservationStartTime,
        Input<String> resourceGroupName,
        Input<String> spacecraftName) {
        this.contactName = contactName;
        this.contactProfile = Objects.requireNonNull(contactProfile, "expected parameter 'contactProfile' to be non-null");
        this.groundStationName = Objects.requireNonNull(groundStationName, "expected parameter 'groundStationName' to be non-null");
        this.reservationEndTime = Objects.requireNonNull(reservationEndTime, "expected parameter 'reservationEndTime' to be non-null");
        this.reservationStartTime = Objects.requireNonNull(reservationStartTime, "expected parameter 'reservationStartTime' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.spacecraftName = Objects.requireNonNull(spacecraftName, "expected parameter 'spacecraftName' to be non-null");
    }

    private ContactArgs() {
        this.contactName = Input.empty();
        this.contactProfile = Input.empty();
        this.groundStationName = Input.empty();
        this.reservationEndTime = Input.empty();
        this.reservationStartTime = Input.empty();
        this.resourceGroupName = Input.empty();
        this.spacecraftName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> contactName;
        private Input<ResourceReferenceArgs> contactProfile;
        private Input<String> groundStationName;
        private Input<String> reservationEndTime;
        private Input<String> reservationStartTime;
        private Input<String> resourceGroupName;
        private Input<String> spacecraftName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactName = defaults.contactName;
    	      this.contactProfile = defaults.contactProfile;
    	      this.groundStationName = defaults.groundStationName;
    	      this.reservationEndTime = defaults.reservationEndTime;
    	      this.reservationStartTime = defaults.reservationStartTime;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.spacecraftName = defaults.spacecraftName;
        }

        public Builder setContactName(@Nullable Input<String> contactName) {
            this.contactName = contactName;
            return this;
        }

        public Builder setContactName(@Nullable String contactName) {
            this.contactName = Input.ofNullable(contactName);
            return this;
        }

        public Builder setContactProfile(Input<ResourceReferenceArgs> contactProfile) {
            this.contactProfile = Objects.requireNonNull(contactProfile);
            return this;
        }

        public Builder setContactProfile(ResourceReferenceArgs contactProfile) {
            this.contactProfile = Input.of(Objects.requireNonNull(contactProfile));
            return this;
        }

        public Builder setGroundStationName(Input<String> groundStationName) {
            this.groundStationName = Objects.requireNonNull(groundStationName);
            return this;
        }

        public Builder setGroundStationName(String groundStationName) {
            this.groundStationName = Input.of(Objects.requireNonNull(groundStationName));
            return this;
        }

        public Builder setReservationEndTime(Input<String> reservationEndTime) {
            this.reservationEndTime = Objects.requireNonNull(reservationEndTime);
            return this;
        }

        public Builder setReservationEndTime(String reservationEndTime) {
            this.reservationEndTime = Input.of(Objects.requireNonNull(reservationEndTime));
            return this;
        }

        public Builder setReservationStartTime(Input<String> reservationStartTime) {
            this.reservationStartTime = Objects.requireNonNull(reservationStartTime);
            return this;
        }

        public Builder setReservationStartTime(String reservationStartTime) {
            this.reservationStartTime = Input.of(Objects.requireNonNull(reservationStartTime));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSpacecraftName(Input<String> spacecraftName) {
            this.spacecraftName = Objects.requireNonNull(spacecraftName);
            return this;
        }

        public Builder setSpacecraftName(String spacecraftName) {
            this.spacecraftName = Input.of(Objects.requireNonNull(spacecraftName));
            return this;
        }

        public ContactArgs build() {
            return new ContactArgs(contactName, contactProfile, groundStationName, reservationEndTime, reservationStartTime, resourceGroupName, spacecraftName);
        }
    }
}
