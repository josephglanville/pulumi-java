// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRoleResult {
    /**
     * The Amazon Resource Name (ARN) specifying the role.
     * 
     */
    private final String arn;
    /**
     * The policy document associated with the role.
     * 
     */
    private final String assumeRolePolicy;
    /**
     * Creation date of the role in RFC 3339 format.
     * 
     */
    private final String createDate;
    /**
     * Description for the role.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Maximum session duration.
     * 
     */
    private final Integer maxSessionDuration;
    private final String name;
    /**
     * The path to the role.
     * 
     */
    private final String path;
    /**
     * The ARN of the policy that is used to set the permissions boundary for the role.
     * 
     */
    private final String permissionsBoundary;
    /**
     * The tags attached to the role.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The stable and unique string identifying the role.
     * 
     */
    private final String uniqueId;

    @CustomType.Constructor
    private GetRoleResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("assumeRolePolicy") String assumeRolePolicy,
        @CustomType.Parameter("createDate") String createDate,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("maxSessionDuration") Integer maxSessionDuration,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("permissionsBoundary") String permissionsBoundary,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("uniqueId") String uniqueId) {
        this.arn = arn;
        this.assumeRolePolicy = assumeRolePolicy;
        this.createDate = createDate;
        this.description = description;
        this.id = id;
        this.maxSessionDuration = maxSessionDuration;
        this.name = name;
        this.path = path;
        this.permissionsBoundary = permissionsBoundary;
        this.tags = tags;
        this.uniqueId = uniqueId;
    }

    /**
     * The Amazon Resource Name (ARN) specifying the role.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The policy document associated with the role.
     * 
    */
    public String getAssumeRolePolicy() {
        return this.assumeRolePolicy;
    }
    /**
     * Creation date of the role in RFC 3339 format.
     * 
    */
    public String getCreateDate() {
        return this.createDate;
    }
    /**
     * Description for the role.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Maximum session duration.
     * 
    */
    public Integer getMaxSessionDuration() {
        return this.maxSessionDuration;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The path to the role.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * The ARN of the policy that is used to set the permissions boundary for the role.
     * 
    */
    public String getPermissionsBoundary() {
        return this.permissionsBoundary;
    }
    /**
     * The tags attached to the role.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The stable and unique string identifying the role.
     * 
    */
    public String getUniqueId() {
        return this.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String assumeRolePolicy;
        private String createDate;
        private String description;
        private String id;
        private Integer maxSessionDuration;
        private String name;
        private String path;
        private String permissionsBoundary;
        private Map<String,String> tags;
        private String uniqueId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assumeRolePolicy = defaults.assumeRolePolicy;
    	      this.createDate = defaults.createDate;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.maxSessionDuration = defaults.maxSessionDuration;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.permissionsBoundary = defaults.permissionsBoundary;
    	      this.tags = defaults.tags;
    	      this.uniqueId = defaults.uniqueId;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder assumeRolePolicy(String assumeRolePolicy) {
            this.assumeRolePolicy = Objects.requireNonNull(assumeRolePolicy);
            return this;
        }
        public Builder createDate(String createDate) {
            this.createDate = Objects.requireNonNull(createDate);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder maxSessionDuration(Integer maxSessionDuration) {
            this.maxSessionDuration = Objects.requireNonNull(maxSessionDuration);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder permissionsBoundary(String permissionsBoundary) {
            this.permissionsBoundary = Objects.requireNonNull(permissionsBoundary);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder uniqueId(String uniqueId) {
            this.uniqueId = Objects.requireNonNull(uniqueId);
            return this;
        }        public GetRoleResult build() {
            return new GetRoleResult(arn, assumeRolePolicy, createDate, description, id, maxSessionDuration, name, path, permissionsBoundary, tags, uniqueId);
        }
    }
}