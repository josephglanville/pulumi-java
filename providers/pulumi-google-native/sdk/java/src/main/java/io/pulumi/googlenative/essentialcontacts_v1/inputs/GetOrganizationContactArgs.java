// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.essentialcontacts_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationContactArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationContactArgs Empty = new GetOrganizationContactArgs();

    @Import(name="contactId", required=true)
      private final String contactId;

    public String getContactId() {
        return this.contactId;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetOrganizationContactArgs(
        String contactId,
        String organizationId) {
        this.contactId = Objects.requireNonNull(contactId, "expected parameter 'contactId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetOrganizationContactArgs() {
        this.contactId = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactId;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactId = defaults.contactId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder contactId(String contactId) {
            this.contactId = Objects.requireNonNull(contactId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }        public GetOrganizationContactArgs build() {
            return new GetOrganizationContactArgs(contactId, organizationId);
        }
    }
}
