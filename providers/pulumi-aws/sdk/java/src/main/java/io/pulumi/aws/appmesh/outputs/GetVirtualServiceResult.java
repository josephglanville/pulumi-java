// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.GetVirtualServiceSpec;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualServiceResult {
    /**
     * The ARN of the virtual service.
     * 
     */
    private final String arn;
    /**
     * The creation date of the virtual service.
     * 
     */
    private final String createdDate;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The last update date of the virtual service.
     * 
     */
    private final String lastUpdatedDate;
    private final String meshName;
    private final String meshOwner;
    private final String name;
    /**
     * The resource owner's AWS account ID.
     * 
     */
    private final String resourceOwner;
    /**
     * The virtual service specification
     * 
     */
    private final List<GetVirtualServiceSpec> specs;
    /**
     * A map of tags.
     * 
     */
    private final @Nullable Map<String,String> tags;

    @CustomType.Constructor
    private GetVirtualServiceResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("createdDate") String createdDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastUpdatedDate") String lastUpdatedDate,
        @CustomType.Parameter("meshName") String meshName,
        @CustomType.Parameter("meshOwner") String meshOwner,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceOwner") String resourceOwner,
        @CustomType.Parameter("specs") List<GetVirtualServiceSpec> specs,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags) {
        this.arn = arn;
        this.createdDate = createdDate;
        this.id = id;
        this.lastUpdatedDate = lastUpdatedDate;
        this.meshName = meshName;
        this.meshOwner = meshOwner;
        this.name = name;
        this.resourceOwner = resourceOwner;
        this.specs = specs;
        this.tags = tags;
    }

    /**
     * The ARN of the virtual service.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The creation date of the virtual service.
     * 
    */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The last update date of the virtual service.
     * 
    */
    public String getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    public String getMeshName() {
        return this.meshName;
    }
    public String getMeshOwner() {
        return this.meshOwner;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The resource owner's AWS account ID.
     * 
    */
    public String getResourceOwner() {
        return this.resourceOwner;
    }
    /**
     * The virtual service specification
     * 
    */
    public List<GetVirtualServiceSpec> getSpecs() {
        return this.specs;
    }
    /**
     * A map of tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String createdDate;
        private String id;
        private String lastUpdatedDate;
        private String meshName;
        private String meshOwner;
        private String name;
        private String resourceOwner;
        private List<GetVirtualServiceSpec> specs;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdDate = defaults.createdDate;
    	      this.id = defaults.id;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.meshName = defaults.meshName;
    	      this.meshOwner = defaults.meshOwner;
    	      this.name = defaults.name;
    	      this.resourceOwner = defaults.resourceOwner;
    	      this.specs = defaults.specs;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastUpdatedDate(String lastUpdatedDate) {
            this.lastUpdatedDate = Objects.requireNonNull(lastUpdatedDate);
            return this;
        }
        public Builder meshName(String meshName) {
            this.meshName = Objects.requireNonNull(meshName);
            return this;
        }
        public Builder meshOwner(String meshOwner) {
            this.meshOwner = Objects.requireNonNull(meshOwner);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceOwner(String resourceOwner) {
            this.resourceOwner = Objects.requireNonNull(resourceOwner);
            return this;
        }
        public Builder specs(List<GetVirtualServiceSpec> specs) {
            this.specs = Objects.requireNonNull(specs);
            return this;
        }
        public Builder specs(GetVirtualServiceSpec... specs) {
            return specs(List.of(specs));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetVirtualServiceResult build() {
            return new GetVirtualServiceResult(arn, createdDate, id, lastUpdatedDate, meshName, meshOwner, name, resourceOwner, specs, tags);
        }
    }
}