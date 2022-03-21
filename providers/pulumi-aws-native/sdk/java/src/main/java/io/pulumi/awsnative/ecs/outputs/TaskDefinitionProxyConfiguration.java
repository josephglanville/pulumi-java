// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.awsnative.ecs.outputs.TaskDefinitionKeyValuePair;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskDefinitionProxyConfiguration {
    private final String containerName;
    private final @Nullable List<TaskDefinitionKeyValuePair> proxyConfigurationProperties;
    private final @Nullable String type;

    @CustomType.Constructor
    private TaskDefinitionProxyConfiguration(
        @CustomType.Parameter("containerName") String containerName,
        @CustomType.Parameter("proxyConfigurationProperties") @Nullable List<TaskDefinitionKeyValuePair> proxyConfigurationProperties,
        @CustomType.Parameter("type") @Nullable String type) {
        this.containerName = containerName;
        this.proxyConfigurationProperties = proxyConfigurationProperties;
        this.type = type;
    }

    public String getContainerName() {
        return this.containerName;
    }
    public List<TaskDefinitionKeyValuePair> getProxyConfigurationProperties() {
        return this.proxyConfigurationProperties == null ? List.of() : this.proxyConfigurationProperties;
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionProxyConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private @Nullable List<TaskDefinitionKeyValuePair> proxyConfigurationProperties;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionProxyConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.proxyConfigurationProperties = defaults.proxyConfigurationProperties;
    	      this.type = defaults.type;
        }

        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder proxyConfigurationProperties(@Nullable List<TaskDefinitionKeyValuePair> proxyConfigurationProperties) {
            this.proxyConfigurationProperties = proxyConfigurationProperties;
            return this;
        }
        public Builder proxyConfigurationProperties(TaskDefinitionKeyValuePair... proxyConfigurationProperties) {
            return proxyConfigurationProperties(List.of(proxyConfigurationProperties));
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public TaskDefinitionProxyConfiguration build() {
            return new TaskDefinitionProxyConfiguration(containerName, proxyConfigurationProperties, type);
        }
    }
}
