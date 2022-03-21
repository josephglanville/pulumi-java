// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.AgentPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.ArgumentResponse;
import io.pulumi.azurenative.containerregistry.outputs.CredentialsResponse;
import io.pulumi.azurenative.containerregistry.outputs.PlatformPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DockerBuildRequestResponse {
    /**
     * The machine configuration of the run agent.
     * 
     */
    private final @Nullable AgentPropertiesResponse agentConfiguration;
    /**
     * The dedicated agent pool for the run.
     * 
     */
    private final @Nullable String agentPoolName;
    /**
     * The collection of override arguments to be used when executing the run.
     * 
     */
    private final @Nullable List<ArgumentResponse> arguments;
    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    private final @Nullable CredentialsResponse credentials;
    /**
     * The Docker file path relative to the source location.
     * 
     */
    private final String dockerFilePath;
    /**
     * The fully qualified image names including the repository and tag.
     * 
     */
    private final @Nullable List<String> imageNames;
    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
     */
    private final @Nullable Boolean isArchiveEnabled;
    /**
     * The value of this property indicates whether the image built should be pushed to the registry or not.
     * 
     */
    private final @Nullable Boolean isPushEnabled;
    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    private final @Nullable String logTemplate;
    /**
     * The value of this property indicates whether the image cache is enabled or not.
     * 
     */
    private final @Nullable Boolean noCache;
    /**
     * The platform properties against which the run has to happen.
     * 
     */
    private final PlatformPropertiesResponse platform;
    /**
     * The URL(absolute or relative) of the source context. It can be an URL to a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     * 
     */
    private final @Nullable String sourceLocation;
    /**
     * The name of the target build stage for the docker build.
     * 
     */
    private final @Nullable String target;
    /**
     * Run timeout in seconds.
     * 
     */
    private final @Nullable Integer timeout;
    /**
     * The type of the run request.
     * Expected value is 'DockerBuildRequest'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DockerBuildRequestResponse(
        @CustomType.Parameter("agentConfiguration") @Nullable AgentPropertiesResponse agentConfiguration,
        @CustomType.Parameter("agentPoolName") @Nullable String agentPoolName,
        @CustomType.Parameter("arguments") @Nullable List<ArgumentResponse> arguments,
        @CustomType.Parameter("credentials") @Nullable CredentialsResponse credentials,
        @CustomType.Parameter("dockerFilePath") String dockerFilePath,
        @CustomType.Parameter("imageNames") @Nullable List<String> imageNames,
        @CustomType.Parameter("isArchiveEnabled") @Nullable Boolean isArchiveEnabled,
        @CustomType.Parameter("isPushEnabled") @Nullable Boolean isPushEnabled,
        @CustomType.Parameter("logTemplate") @Nullable String logTemplate,
        @CustomType.Parameter("noCache") @Nullable Boolean noCache,
        @CustomType.Parameter("platform") PlatformPropertiesResponse platform,
        @CustomType.Parameter("sourceLocation") @Nullable String sourceLocation,
        @CustomType.Parameter("target") @Nullable String target,
        @CustomType.Parameter("timeout") @Nullable Integer timeout,
        @CustomType.Parameter("type") String type) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.arguments = arguments;
        this.credentials = credentials;
        this.dockerFilePath = dockerFilePath;
        this.imageNames = imageNames;
        this.isArchiveEnabled = isArchiveEnabled;
        this.isPushEnabled = isPushEnabled;
        this.logTemplate = logTemplate;
        this.noCache = noCache;
        this.platform = platform;
        this.sourceLocation = sourceLocation;
        this.target = target;
        this.timeout = timeout;
        this.type = type;
    }

    /**
     * The machine configuration of the run agent.
     * 
    */
    public Optional<AgentPropertiesResponse> getAgentConfiguration() {
        return Optional.ofNullable(this.agentConfiguration);
    }
    /**
     * The dedicated agent pool for the run.
     * 
    */
    public Optional<String> getAgentPoolName() {
        return Optional.ofNullable(this.agentPoolName);
    }
    /**
     * The collection of override arguments to be used when executing the run.
     * 
    */
    public List<ArgumentResponse> getArguments() {
        return this.arguments == null ? List.of() : this.arguments;
    }
    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
    */
    public Optional<CredentialsResponse> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * The Docker file path relative to the source location.
     * 
    */
    public String getDockerFilePath() {
        return this.dockerFilePath;
    }
    /**
     * The fully qualified image names including the repository and tag.
     * 
    */
    public List<String> getImageNames() {
        return this.imageNames == null ? List.of() : this.imageNames;
    }
    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
    */
    public Optional<Boolean> getIsArchiveEnabled() {
        return Optional.ofNullable(this.isArchiveEnabled);
    }
    /**
     * The value of this property indicates whether the image built should be pushed to the registry or not.
     * 
    */
    public Optional<Boolean> getIsPushEnabled() {
        return Optional.ofNullable(this.isPushEnabled);
    }
    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
    */
    public Optional<String> getLogTemplate() {
        return Optional.ofNullable(this.logTemplate);
    }
    /**
     * The value of this property indicates whether the image cache is enabled or not.
     * 
    */
    public Optional<Boolean> getNoCache() {
        return Optional.ofNullable(this.noCache);
    }
    /**
     * The platform properties against which the run has to happen.
     * 
    */
    public PlatformPropertiesResponse getPlatform() {
        return this.platform;
    }
    /**
     * The URL(absolute or relative) of the source context. It can be an URL to a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     * 
    */
    public Optional<String> getSourceLocation() {
        return Optional.ofNullable(this.sourceLocation);
    }
    /**
     * The name of the target build stage for the docker build.
     * 
    */
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }
    /**
     * Run timeout in seconds.
     * 
    */
    public Optional<Integer> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * The type of the run request.
     * Expected value is 'DockerBuildRequest'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerBuildRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AgentPropertiesResponse agentConfiguration;
        private @Nullable String agentPoolName;
        private @Nullable List<ArgumentResponse> arguments;
        private @Nullable CredentialsResponse credentials;
        private String dockerFilePath;
        private @Nullable List<String> imageNames;
        private @Nullable Boolean isArchiveEnabled;
        private @Nullable Boolean isPushEnabled;
        private @Nullable String logTemplate;
        private @Nullable Boolean noCache;
        private PlatformPropertiesResponse platform;
        private @Nullable String sourceLocation;
        private @Nullable String target;
        private @Nullable Integer timeout;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerBuildRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.arguments = defaults.arguments;
    	      this.credentials = defaults.credentials;
    	      this.dockerFilePath = defaults.dockerFilePath;
    	      this.imageNames = defaults.imageNames;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.isPushEnabled = defaults.isPushEnabled;
    	      this.logTemplate = defaults.logTemplate;
    	      this.noCache = defaults.noCache;
    	      this.platform = defaults.platform;
    	      this.sourceLocation = defaults.sourceLocation;
    	      this.target = defaults.target;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
        }

        public Builder agentConfiguration(@Nullable AgentPropertiesResponse agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }
        public Builder agentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }
        public Builder arguments(@Nullable List<ArgumentResponse> arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder arguments(ArgumentResponse... arguments) {
            return arguments(List.of(arguments));
        }
        public Builder credentials(@Nullable CredentialsResponse credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder dockerFilePath(String dockerFilePath) {
            this.dockerFilePath = Objects.requireNonNull(dockerFilePath);
            return this;
        }
        public Builder imageNames(@Nullable List<String> imageNames) {
            this.imageNames = imageNames;
            return this;
        }
        public Builder imageNames(String... imageNames) {
            return imageNames(List.of(imageNames));
        }
        public Builder isArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }
        public Builder isPushEnabled(@Nullable Boolean isPushEnabled) {
            this.isPushEnabled = isPushEnabled;
            return this;
        }
        public Builder logTemplate(@Nullable String logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }
        public Builder noCache(@Nullable Boolean noCache) {
            this.noCache = noCache;
            return this;
        }
        public Builder platform(PlatformPropertiesResponse platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }
        public Builder sourceLocation(@Nullable String sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DockerBuildRequestResponse build() {
            return new DockerBuildRequestResponse(agentConfiguration, agentPoolName, arguments, credentials, dockerFilePath, imageNames, isArchiveEnabled, isPushEnabled, logTemplate, noCache, platform, sourceLocation, target, timeout, type);
        }
    }
}
