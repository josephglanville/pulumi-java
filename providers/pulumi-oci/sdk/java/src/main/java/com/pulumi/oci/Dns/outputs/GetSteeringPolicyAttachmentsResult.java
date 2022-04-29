// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Dns.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Dns.outputs.GetSteeringPolicyAttachmentsFilter;
import com.pulumi.oci.Dns.outputs.GetSteeringPolicyAttachmentsSteeringPolicyAttachment;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSteeringPolicyAttachmentsResult {
    /**
     * @return The OCID of the compartment containing the steering policy attachment.
     * 
     */
    private final String compartmentId;
    /**
     * @return A user-friendly name for the steering policy attachment. Does not have to be unique and can be changed. Avoid entering confidential information.
     * 
     */
    private final @Nullable String displayName;
    private final @Nullable String domain;
    private final @Nullable String domainContains;
    private final @Nullable List<GetSteeringPolicyAttachmentsFilter> filters;
    /**
     * @return The OCID of the resource.
     * 
     */
    private final @Nullable String id;
    /**
     * @return The current state of the resource.
     * 
     */
    private final @Nullable String state;
    /**
     * @return The list of steering_policy_attachments.
     * 
     */
    private final List<GetSteeringPolicyAttachmentsSteeringPolicyAttachment> steeringPolicyAttachments;
    /**
     * @return The OCID of the attached steering policy.
     * 
     */
    private final @Nullable String steeringPolicyId;
    private final @Nullable String timeCreatedGreaterThanOrEqualTo;
    private final @Nullable String timeCreatedLessThan;
    /**
     * @return The OCID of the attached zone.
     * 
     */
    private final @Nullable String zoneId;

    @CustomType.Constructor
    private GetSteeringPolicyAttachmentsResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("domain") @Nullable String domain,
        @CustomType.Parameter("domainContains") @Nullable String domainContains,
        @CustomType.Parameter("filters") @Nullable List<GetSteeringPolicyAttachmentsFilter> filters,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("steeringPolicyAttachments") List<GetSteeringPolicyAttachmentsSteeringPolicyAttachment> steeringPolicyAttachments,
        @CustomType.Parameter("steeringPolicyId") @Nullable String steeringPolicyId,
        @CustomType.Parameter("timeCreatedGreaterThanOrEqualTo") @Nullable String timeCreatedGreaterThanOrEqualTo,
        @CustomType.Parameter("timeCreatedLessThan") @Nullable String timeCreatedLessThan,
        @CustomType.Parameter("zoneId") @Nullable String zoneId) {
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.domain = domain;
        this.domainContains = domainContains;
        this.filters = filters;
        this.id = id;
        this.state = state;
        this.steeringPolicyAttachments = steeringPolicyAttachments;
        this.steeringPolicyId = steeringPolicyId;
        this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
        this.timeCreatedLessThan = timeCreatedLessThan;
        this.zoneId = zoneId;
    }

    /**
     * @return The OCID of the compartment containing the steering policy attachment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return A user-friendly name for the steering policy attachment. Does not have to be unique and can be changed. Avoid entering confidential information.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    public Optional<String> domainContains() {
        return Optional.ofNullable(this.domainContains);
    }
    public List<GetSteeringPolicyAttachmentsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The OCID of the resource.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The current state of the resource.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return The list of steering_policy_attachments.
     * 
     */
    public List<GetSteeringPolicyAttachmentsSteeringPolicyAttachment> steeringPolicyAttachments() {
        return this.steeringPolicyAttachments;
    }
    /**
     * @return The OCID of the attached steering policy.
     * 
     */
    public Optional<String> steeringPolicyId() {
        return Optional.ofNullable(this.steeringPolicyId);
    }
    public Optional<String> timeCreatedGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timeCreatedGreaterThanOrEqualTo);
    }
    public Optional<String> timeCreatedLessThan() {
        return Optional.ofNullable(this.timeCreatedLessThan);
    }
    /**
     * @return The OCID of the attached zone.
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSteeringPolicyAttachmentsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private @Nullable String displayName;
        private @Nullable String domain;
        private @Nullable String domainContains;
        private @Nullable List<GetSteeringPolicyAttachmentsFilter> filters;
        private @Nullable String id;
        private @Nullable String state;
        private List<GetSteeringPolicyAttachmentsSteeringPolicyAttachment> steeringPolicyAttachments;
        private @Nullable String steeringPolicyId;
        private @Nullable String timeCreatedGreaterThanOrEqualTo;
        private @Nullable String timeCreatedLessThan;
        private @Nullable String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSteeringPolicyAttachmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.displayName = defaults.displayName;
    	      this.domain = defaults.domain;
    	      this.domainContains = defaults.domainContains;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.state = defaults.state;
    	      this.steeringPolicyAttachments = defaults.steeringPolicyAttachments;
    	      this.steeringPolicyId = defaults.steeringPolicyId;
    	      this.timeCreatedGreaterThanOrEqualTo = defaults.timeCreatedGreaterThanOrEqualTo;
    	      this.timeCreatedLessThan = defaults.timeCreatedLessThan;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }
        public Builder domainContains(@Nullable String domainContains) {
            this.domainContains = domainContains;
            return this;
        }
        public Builder filters(@Nullable List<GetSteeringPolicyAttachmentsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSteeringPolicyAttachmentsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder steeringPolicyAttachments(List<GetSteeringPolicyAttachmentsSteeringPolicyAttachment> steeringPolicyAttachments) {
            this.steeringPolicyAttachments = Objects.requireNonNull(steeringPolicyAttachments);
            return this;
        }
        public Builder steeringPolicyAttachments(GetSteeringPolicyAttachmentsSteeringPolicyAttachment... steeringPolicyAttachments) {
            return steeringPolicyAttachments(List.of(steeringPolicyAttachments));
        }
        public Builder steeringPolicyId(@Nullable String steeringPolicyId) {
            this.steeringPolicyId = steeringPolicyId;
            return this;
        }
        public Builder timeCreatedGreaterThanOrEqualTo(@Nullable String timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }
        public Builder timeCreatedLessThan(@Nullable String timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }        public GetSteeringPolicyAttachmentsResult build() {
            return new GetSteeringPolicyAttachmentsResult(compartmentId, displayName, domain, domainContains, filters, id, state, steeringPolicyAttachments, steeringPolicyId, timeCreatedGreaterThanOrEqualTo, timeCreatedLessThan, zoneId);
        }
    }
}
