// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devops.outputs;

import io.pulumi.azurenative.devops.outputs.AuthorizationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CodeRepositoryResponse {
    /**
     * Authorization info to access the code repository.
     * 
     */
    private final @Nullable AuthorizationResponse authorization;
    /**
     * Default branch used to configure Continuous Integration (CI) in the pipeline.
     * 
     */
    private final String defaultBranch;
    /**
     * Unique immutable identifier of the code repository.
     * 
     */
    private final String id;
    /**
     * Repository-specific properties.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * Type of code repository.
     * 
     */
    private final String repositoryType;

    @CustomType.Constructor
    private CodeRepositoryResponse(
        @CustomType.Parameter("authorization") @Nullable AuthorizationResponse authorization,
        @CustomType.Parameter("defaultBranch") String defaultBranch,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("repositoryType") String repositoryType) {
        this.authorization = authorization;
        this.defaultBranch = defaultBranch;
        this.id = id;
        this.properties = properties;
        this.repositoryType = repositoryType;
    }

    /**
     * Authorization info to access the code repository.
     * 
    */
    public Optional<AuthorizationResponse> getAuthorization() {
        return Optional.ofNullable(this.authorization);
    }
    /**
     * Default branch used to configure Continuous Integration (CI) in the pipeline.
     * 
    */
    public String getDefaultBranch() {
        return this.defaultBranch;
    }
    /**
     * Unique immutable identifier of the code repository.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Repository-specific properties.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Type of code repository.
     * 
    */
    public String getRepositoryType() {
        return this.repositoryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AuthorizationResponse authorization;
        private String defaultBranch;
        private String id;
        private @Nullable Map<String,String> properties;
        private String repositoryType;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorization = defaults.authorization;
    	      this.defaultBranch = defaults.defaultBranch;
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
    	      this.repositoryType = defaults.repositoryType;
        }

        public Builder authorization(@Nullable AuthorizationResponse authorization) {
            this.authorization = authorization;
            return this;
        }
        public Builder defaultBranch(String defaultBranch) {
            this.defaultBranch = Objects.requireNonNull(defaultBranch);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder repositoryType(String repositoryType) {
            this.repositoryType = Objects.requireNonNull(repositoryType);
            return this;
        }        public CodeRepositoryResponse build() {
            return new CodeRepositoryResponse(authorization, defaultBranch, id, properties, repositoryType);
        }
    }
}
