// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.AllocationSpecificSKUReservationResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ShareSettingsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReservationResponse {
    private final String commitment;
    private final String creationTimestamp;
    private final String description;
    private final String kind;
    private final String name;
    private final Boolean satisfiesPzs;
    private final String selfLink;
    private final String selfLinkWithId;
    private final ShareSettingsResponse shareSettings;
    private final AllocationSpecificSKUReservationResponse specificReservation;
    private final Boolean specificReservationRequired;
    private final String status;
    private final String zone;

    @OutputCustomType.Constructor({"commitment","creationTimestamp","description","kind","name","satisfiesPzs","selfLink","selfLinkWithId","shareSettings","specificReservation","specificReservationRequired","status","zone"})
    private ReservationResponse(
        String commitment,
        String creationTimestamp,
        String description,
        String kind,
        String name,
        Boolean satisfiesPzs,
        String selfLink,
        String selfLinkWithId,
        ShareSettingsResponse shareSettings,
        AllocationSpecificSKUReservationResponse specificReservation,
        Boolean specificReservationRequired,
        String status,
        String zone) {
        this.commitment = Objects.requireNonNull(commitment);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
        this.shareSettings = Objects.requireNonNull(shareSettings);
        this.specificReservation = Objects.requireNonNull(specificReservation);
        this.specificReservationRequired = Objects.requireNonNull(specificReservationRequired);
        this.status = Objects.requireNonNull(status);
        this.zone = Objects.requireNonNull(zone);
    }

    public String getCommitment() {
        return this.commitment;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public Boolean getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    public ShareSettingsResponse getShareSettings() {
        return this.shareSettings;
    }
    public AllocationSpecificSKUReservationResponse getSpecificReservation() {
        return this.specificReservation;
    }
    public Boolean getSpecificReservationRequired() {
        return this.specificReservationRequired;
    }
    public String getStatus() {
        return this.status;
    }
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commitment;
        private String creationTimestamp;
        private String description;
        private String kind;
        private String name;
        private Boolean satisfiesPzs;
        private String selfLink;
        private String selfLinkWithId;
        private ShareSettingsResponse shareSettings;
        private AllocationSpecificSKUReservationResponse specificReservation;
        private Boolean specificReservationRequired;
        private String status;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitment = defaults.commitment;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.shareSettings = defaults.shareSettings;
    	      this.specificReservation = defaults.specificReservation;
    	      this.specificReservationRequired = defaults.specificReservationRequired;
    	      this.status = defaults.status;
    	      this.zone = defaults.zone;
        }

        public Builder setCommitment(String commitment) {
            this.commitment = Objects.requireNonNull(commitment);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSatisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setShareSettings(ShareSettingsResponse shareSettings) {
            this.shareSettings = Objects.requireNonNull(shareSettings);
            return this;
        }

        public Builder setSpecificReservation(AllocationSpecificSKUReservationResponse specificReservation) {
            this.specificReservation = Objects.requireNonNull(specificReservation);
            return this;
        }

        public Builder setSpecificReservationRequired(Boolean specificReservationRequired) {
            this.specificReservationRequired = Objects.requireNonNull(specificReservationRequired);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public ReservationResponse build() {
            return new ReservationResponse(commitment, creationTimestamp, description, kind, name, satisfiesPzs, selfLink, selfLinkWithId, shareSettings, specificReservation, specificReservationRequired, status, zone);
        }
    }
}