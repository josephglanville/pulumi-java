// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetRepositoryResult {
    /**
     * The ARN of the repository
     * 
     */
    private final String arn;
    /**
     * The URL to use for cloning the repository over HTTPS.
     * 
     */
    private final String cloneUrlHttp;
    /**
     * The URL to use for cloning the repository over SSH.
     * 
     */
    private final String cloneUrlSsh;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The ID of the repository
     * 
     */
    private final String repositoryId;
    private final String repositoryName;

    @OutputCustomType.Constructor
    private GetRepositoryResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("cloneUrlHttp") String cloneUrlHttp,
        @OutputCustomType.Parameter("cloneUrlSsh") String cloneUrlSsh,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("repositoryId") String repositoryId,
        @OutputCustomType.Parameter("repositoryName") String repositoryName) {
        this.arn = arn;
        this.cloneUrlHttp = cloneUrlHttp;
        this.cloneUrlSsh = cloneUrlSsh;
        this.id = id;
        this.repositoryId = repositoryId;
        this.repositoryName = repositoryName;
    }

    /**
     * The ARN of the repository
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The URL to use for cloning the repository over HTTPS.
     * 
    */
    public String getCloneUrlHttp() {
        return this.cloneUrlHttp;
    }
    /**
     * The URL to use for cloning the repository over SSH.
     * 
    */
    public String getCloneUrlSsh() {
        return this.cloneUrlSsh;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The ID of the repository
     * 
    */
    public String getRepositoryId() {
        return this.repositoryId;
    }
    public String getRepositoryName() {
        return this.repositoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String cloneUrlHttp;
        private String cloneUrlSsh;
        private String id;
        private String repositoryId;
        private String repositoryName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.cloneUrlHttp = defaults.cloneUrlHttp;
    	      this.cloneUrlSsh = defaults.cloneUrlSsh;
    	      this.id = defaults.id;
    	      this.repositoryId = defaults.repositoryId;
    	      this.repositoryName = defaults.repositoryName;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCloneUrlHttp(String cloneUrlHttp) {
            this.cloneUrlHttp = Objects.requireNonNull(cloneUrlHttp);
            return this;
        }

        public Builder setCloneUrlSsh(String cloneUrlSsh) {
            this.cloneUrlSsh = Objects.requireNonNull(cloneUrlSsh);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setRepositoryId(String repositoryId) {
            this.repositoryId = Objects.requireNonNull(repositoryId);
            return this;
        }

        public Builder setRepositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public GetRepositoryResult build() {
            return new GetRepositoryResult(arn, cloneUrlHttp, cloneUrlSsh, id, repositoryId, repositoryName);
        }
    }
}
