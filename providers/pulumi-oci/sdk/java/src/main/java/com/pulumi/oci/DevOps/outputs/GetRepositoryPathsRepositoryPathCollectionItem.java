// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRepositoryPathsRepositoryPathCollectionItem {
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return Name of file or directory.
     * 
     */
    private final String name;
    /**
     * @return Path to file or directory in a repository.
     * 
     */
    private final String path;
    /**
     * @return SHA-1 checksum of blob or tree.
     * 
     */
    private final String sha;
    /**
     * @return Size of file or directory.
     * 
     */
    private final String sizeInBytes;
    /**
     * @return The git URL of the submodule.
     * 
     */
    private final String submoduleGitUrl;
    /**
     * @return File or directory.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRepositoryPathsRepositoryPathCollectionItem(
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("sha") String sha,
        @CustomType.Parameter("sizeInBytes") String sizeInBytes,
        @CustomType.Parameter("submoduleGitUrl") String submoduleGitUrl,
        @CustomType.Parameter("type") String type) {
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.name = name;
        this.path = path;
        this.sha = sha;
        this.sizeInBytes = sizeInBytes;
        this.submoduleGitUrl = submoduleGitUrl;
        this.type = type;
    }

    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return Name of file or directory.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Path to file or directory in a repository.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return SHA-1 checksum of blob or tree.
     * 
     */
    public String sha() {
        return this.sha;
    }
    /**
     * @return Size of file or directory.
     * 
     */
    public String sizeInBytes() {
        return this.sizeInBytes;
    }
    /**
     * @return The git URL of the submodule.
     * 
     */
    public String submoduleGitUrl() {
        return this.submoduleGitUrl;
    }
    /**
     * @return File or directory.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryPathsRepositoryPathCollectionItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> definedTags;
        private Map<String,Object> freeformTags;
        private String name;
        private String path;
        private String sha;
        private String sizeInBytes;
        private String submoduleGitUrl;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryPathsRepositoryPathCollectionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definedTags = defaults.definedTags;
    	      this.freeformTags = defaults.freeformTags;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.sha = defaults.sha;
    	      this.sizeInBytes = defaults.sizeInBytes;
    	      this.submoduleGitUrl = defaults.submoduleGitUrl;
    	      this.type = defaults.type;
        }

        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
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
        public Builder sha(String sha) {
            this.sha = Objects.requireNonNull(sha);
            return this;
        }
        public Builder sizeInBytes(String sizeInBytes) {
            this.sizeInBytes = Objects.requireNonNull(sizeInBytes);
            return this;
        }
        public Builder submoduleGitUrl(String submoduleGitUrl) {
            this.submoduleGitUrl = Objects.requireNonNull(submoduleGitUrl);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRepositoryPathsRepositoryPathCollectionItem build() {
            return new GetRepositoryPathsRepositoryPathCollectionItem(definedTags, freeformTags, name, path, sha, sizeInBytes, submoduleGitUrl, type);
        }
    }
}
