// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Email.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSenderResult {
    /**
     * @return The OCID for the compartment.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The email address of the sender.
     * 
     */
    private final String emailAddress;
    /**
     * @return The email domain used to assert responsibility for emails sent from this sender.
     * 
     */
    private final String emailDomainId;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The unique OCID of the sender.
     * 
     */
    private final String id;
    /**
     * @return Value of the SPF field. For more information about SPF, please see [SPF Authentication](https://docs.cloud.oracle.com/iaas/Content/Email/Concepts/overview.htm#components).
     * 
     */
    private final Boolean isSpf;
    private final String senderId;
    /**
     * @return The current status of the approved sender.
     * 
     */
    private final String state;
    /**
     * @return The date and time the approved sender was added in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    private final String timeCreated;

    @CustomType.Constructor
    private GetSenderResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("emailAddress") String emailAddress,
        @CustomType.Parameter("emailDomainId") String emailDomainId,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isSpf") Boolean isSpf,
        @CustomType.Parameter("senderId") String senderId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated) {
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.emailAddress = emailAddress;
        this.emailDomainId = emailDomainId;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isSpf = isSpf;
        this.senderId = senderId;
        this.state = state;
        this.timeCreated = timeCreated;
    }

    /**
     * @return The OCID for the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return The email address of the sender.
     * 
     */
    public String emailAddress() {
        return this.emailAddress;
    }
    /**
     * @return The email domain used to assert responsibility for emails sent from this sender.
     * 
     */
    public String emailDomainId() {
        return this.emailDomainId;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The unique OCID of the sender.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Value of the SPF field. For more information about SPF, please see [SPF Authentication](https://docs.cloud.oracle.com/iaas/Content/Email/Concepts/overview.htm#components).
     * 
     */
    public Boolean isSpf() {
        return this.isSpf;
    }
    public String senderId() {
        return this.senderId;
    }
    /**
     * @return The current status of the approved sender.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time the approved sender was added in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSenderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String emailAddress;
        private String emailDomainId;
        private Map<String,Object> freeformTags;
        private String id;
        private Boolean isSpf;
        private String senderId;
        private String state;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSenderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.emailAddress = defaults.emailAddress;
    	      this.emailDomainId = defaults.emailDomainId;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.isSpf = defaults.isSpf;
    	      this.senderId = defaults.senderId;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }
        public Builder emailDomainId(String emailDomainId) {
            this.emailDomainId = Objects.requireNonNull(emailDomainId);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isSpf(Boolean isSpf) {
            this.isSpf = Objects.requireNonNull(isSpf);
            return this;
        }
        public Builder senderId(String senderId) {
            this.senderId = Objects.requireNonNull(senderId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }        public GetSenderResult build() {
            return new GetSenderResult(compartmentId, definedTags, emailAddress, emailDomainId, freeformTags, id, isSpf, senderId, state, timeCreated);
        }
    }
}
