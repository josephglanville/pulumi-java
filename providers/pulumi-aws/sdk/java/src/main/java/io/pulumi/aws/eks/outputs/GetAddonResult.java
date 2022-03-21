// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAddonResult {
    private final String addonName;
    /**
     * The version of EKS add-on.
     * 
     */
    private final String addonVersion;
    /**
     * Amazon Resource Name (ARN) of the EKS add-on.
     * 
     */
    private final String arn;
    private final String clusterName;
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
     * 
     */
    private final String createdAt;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
     * 
     */
    private final String modifiedAt;
    /**
     * ARN of IAM role used for EKS add-on. If value is empty -
     * then add-on uses the IAM role assigned to the EKS Cluster node.
     * 
     */
    private final String serviceAccountRoleArn;
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetAddonResult(
        @CustomType.Parameter("addonName") String addonName,
        @CustomType.Parameter("addonVersion") String addonVersion,
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("clusterName") String clusterName,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("modifiedAt") String modifiedAt,
        @CustomType.Parameter("serviceAccountRoleArn") String serviceAccountRoleArn,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.addonName = addonName;
        this.addonVersion = addonVersion;
        this.arn = arn;
        this.clusterName = clusterName;
        this.createdAt = createdAt;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.serviceAccountRoleArn = serviceAccountRoleArn;
        this.tags = tags;
    }

    public String getAddonName() {
        return this.addonName;
    }
    /**
     * The version of EKS add-on.
     * 
    */
    public String getAddonVersion() {
        return this.addonVersion;
    }
    /**
     * Amazon Resource Name (ARN) of the EKS add-on.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    public String getClusterName() {
        return this.clusterName;
    }
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
     * 
    */
    public String getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * ARN of IAM role used for EKS add-on. If value is empty -
     * then add-on uses the IAM role assigned to the EKS Cluster node.
     * 
    */
    public String getServiceAccountRoleArn() {
        return this.serviceAccountRoleArn;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAddonResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addonName;
        private String addonVersion;
        private String arn;
        private String clusterName;
        private String createdAt;
        private String id;
        private String modifiedAt;
        private String serviceAccountRoleArn;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAddonResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonName = defaults.addonName;
    	      this.addonVersion = defaults.addonVersion;
    	      this.arn = defaults.arn;
    	      this.clusterName = defaults.clusterName;
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.modifiedAt = defaults.modifiedAt;
    	      this.serviceAccountRoleArn = defaults.serviceAccountRoleArn;
    	      this.tags = defaults.tags;
        }

        public Builder addonName(String addonName) {
            this.addonName = Objects.requireNonNull(addonName);
            return this;
        }
        public Builder addonVersion(String addonVersion) {
            this.addonVersion = Objects.requireNonNull(addonVersion);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder modifiedAt(String modifiedAt) {
            this.modifiedAt = Objects.requireNonNull(modifiedAt);
            return this;
        }
        public Builder serviceAccountRoleArn(String serviceAccountRoleArn) {
            this.serviceAccountRoleArn = Objects.requireNonNull(serviceAccountRoleArn);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetAddonResult build() {
            return new GetAddonResult(addonName, addonVersion, arn, clusterName, createdAt, id, modifiedAt, serviceAccountRoleArn, tags);
        }
    }
}
