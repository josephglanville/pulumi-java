// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.ReservationShareSettingsArgs;
import io.pulumi.gcp.compute.inputs.ReservationSpecificReservationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationArgs Empty = new ReservationArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The share setting for reservations.
     * Structure is documented below.
     * 
     */
    @Import(name="shareSettings")
      private final @Nullable Output<ReservationShareSettingsArgs> shareSettings;

    public Output<ReservationShareSettingsArgs> getShareSettings() {
        return this.shareSettings == null ? Output.empty() : this.shareSettings;
    }

    /**
     * Reservation for instances with specific machine shapes.
     * Structure is documented below.
     * 
     */
    @Import(name="specificReservation", required=true)
      private final Output<ReservationSpecificReservationArgs> specificReservation;

    public Output<ReservationSpecificReservationArgs> getSpecificReservation() {
        return this.specificReservation;
    }

    /**
     * When set to true, only VMs that target this reservation by name can
     * consume this reservation. Otherwise, it can be consumed by VMs with
     * affinity for any reservation. Defaults to false.
     * 
     */
    @Import(name="specificReservationRequired")
      private final @Nullable Output<Boolean> specificReservationRequired;

    public Output<Boolean> getSpecificReservationRequired() {
        return this.specificReservationRequired == null ? Output.empty() : this.specificReservationRequired;
    }

    /**
     * The zone where the reservation is made.
     * 
     */
    @Import(name="zone", required=true)
      private final Output<String> zone;

    public Output<String> getZone() {
        return this.zone;
    }

    public ReservationArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<ReservationShareSettingsArgs> shareSettings,
        Output<ReservationSpecificReservationArgs> specificReservation,
        @Nullable Output<Boolean> specificReservationRequired,
        Output<String> zone) {
        this.description = description;
        this.name = name;
        this.project = project;
        this.shareSettings = shareSettings;
        this.specificReservation = Objects.requireNonNull(specificReservation, "expected parameter 'specificReservation' to be non-null");
        this.specificReservationRequired = specificReservationRequired;
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private ReservationArgs() {
        this.description = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.shareSettings = Output.empty();
        this.specificReservation = Output.empty();
        this.specificReservationRequired = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<ReservationShareSettingsArgs> shareSettings;
        private Output<ReservationSpecificReservationArgs> specificReservation;
        private @Nullable Output<Boolean> specificReservationRequired;
        private Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.shareSettings = defaults.shareSettings;
    	      this.specificReservation = defaults.specificReservation;
    	      this.specificReservationRequired = defaults.specificReservationRequired;
    	      this.zone = defaults.zone;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder shareSettings(@Nullable Output<ReservationShareSettingsArgs> shareSettings) {
            this.shareSettings = shareSettings;
            return this;
        }
        public Builder shareSettings(@Nullable ReservationShareSettingsArgs shareSettings) {
            this.shareSettings = Output.ofNullable(shareSettings);
            return this;
        }
        public Builder specificReservation(Output<ReservationSpecificReservationArgs> specificReservation) {
            this.specificReservation = Objects.requireNonNull(specificReservation);
            return this;
        }
        public Builder specificReservation(ReservationSpecificReservationArgs specificReservation) {
            this.specificReservation = Output.of(Objects.requireNonNull(specificReservation));
            return this;
        }
        public Builder specificReservationRequired(@Nullable Output<Boolean> specificReservationRequired) {
            this.specificReservationRequired = specificReservationRequired;
            return this;
        }
        public Builder specificReservationRequired(@Nullable Boolean specificReservationRequired) {
            this.specificReservationRequired = Output.ofNullable(specificReservationRequired);
            return this;
        }
        public Builder zone(Output<String> zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Output.of(Objects.requireNonNull(zone));
            return this;
        }        public ReservationArgs build() {
            return new ReservationArgs(description, name, project, shareSettings, specificReservation, specificReservationRequired, zone);
        }
    }
}
