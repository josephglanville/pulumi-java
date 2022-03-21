// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudidentity_v1beta1.inputs.ExpiryDetailResponse;
import io.pulumi.googlenative.cloudidentity_v1beta1.inputs.RestrictionEvaluationsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A membership role within the Cloud Identity Groups API. A `MembershipRole` defines the privileges granted to a `Membership`.
 * 
 */
public final class MembershipRoleResponse extends io.pulumi.resources.InvokeArgs {

    public static final MembershipRoleResponse Empty = new MembershipRoleResponse();

    /**
     * The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER` `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other value.
     * 
     */
    @Import(name="expiryDetail", required=true)
      private final ExpiryDetailResponse expiryDetail;

    public ExpiryDetailResponse getExpiryDetail() {
        return this.expiryDetail;
    }

    /**
     * The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Evaluations of restrictions applied to parent group on this membership.
     * 
     */
    @Import(name="restrictionEvaluations", required=true)
      private final RestrictionEvaluationsResponse restrictionEvaluations;

    public RestrictionEvaluationsResponse getRestrictionEvaluations() {
        return this.restrictionEvaluations;
    }

    public MembershipRoleResponse(
        ExpiryDetailResponse expiryDetail,
        String name,
        RestrictionEvaluationsResponse restrictionEvaluations) {
        this.expiryDetail = Objects.requireNonNull(expiryDetail, "expected parameter 'expiryDetail' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.restrictionEvaluations = Objects.requireNonNull(restrictionEvaluations, "expected parameter 'restrictionEvaluations' to be non-null");
    }

    private MembershipRoleResponse() {
        this.expiryDetail = null;
        this.name = null;
        this.restrictionEvaluations = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipRoleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpiryDetailResponse expiryDetail;
        private String name;
        private RestrictionEvaluationsResponse restrictionEvaluations;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipRoleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiryDetail = defaults.expiryDetail;
    	      this.name = defaults.name;
    	      this.restrictionEvaluations = defaults.restrictionEvaluations;
        }

        public Builder expiryDetail(ExpiryDetailResponse expiryDetail) {
            this.expiryDetail = Objects.requireNonNull(expiryDetail);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder restrictionEvaluations(RestrictionEvaluationsResponse restrictionEvaluations) {
            this.restrictionEvaluations = Objects.requireNonNull(restrictionEvaluations);
            return this;
        }        public MembershipRoleResponse build() {
            return new MembershipRoleResponse(expiryDetail, name, restrictionEvaluations);
        }
    }
}
