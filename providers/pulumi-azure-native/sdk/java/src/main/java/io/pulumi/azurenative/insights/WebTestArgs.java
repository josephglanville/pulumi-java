// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.enums.WebTestKind;
import io.pulumi.azurenative.insights.inputs.WebTestGeolocationArgs;
import io.pulumi.azurenative.insights.inputs.WebTestPropertiesConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebTestArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebTestArgs Empty = new WebTestArgs();

    /**
     * An XML configuration specification for a WebTest.
     * 
     */
    @Import(name="configuration")
      private final @Nullable Output<WebTestPropertiesConfigurationArgs> configuration;

    public Output<WebTestPropertiesConfigurationArgs> getConfiguration() {
        return this.configuration == null ? Output.empty() : this.configuration;
    }

    /**
     * Purpose/user defined descriptive test for this WebTest.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Is the test actively being monitored.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Interval in seconds between test runs for this WebTest. Default value is 300.
     * 
     */
    @Import(name="frequency")
      private final @Nullable Output<Integer> frequency;

    public Output<Integer> getFrequency() {
        return this.frequency == null ? Output.empty() : this.frequency;
    }

    /**
     * The kind of web test that this web test watches. Choices are ping and multistep.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<WebTestKind> kind;

    public Output<WebTestKind> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * A list of where to physically run the tests from to give global coverage for accessibility of your application.
     * 
     */
    @Import(name="locations", required=true)
      private final Output<List<WebTestGeolocationArgs>> locations;

    public Output<List<WebTestGeolocationArgs>> getLocations() {
        return this.locations;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Allow for retries should this WebTest fail.
     * 
     */
    @Import(name="retryEnabled")
      private final @Nullable Output<Boolean> retryEnabled;

    public Output<Boolean> getRetryEnabled() {
        return this.retryEnabled == null ? Output.empty() : this.retryEnabled;
    }

    /**
     * Unique ID of this WebTest. This is typically the same value as the Name field.
     * 
     */
    @Import(name="syntheticMonitorId", required=true)
      private final Output<String> syntheticMonitorId;

    public Output<String> getSyntheticMonitorId() {
        return this.syntheticMonitorId;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Seconds until this WebTest will timeout and fail. Default value is 30.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<Integer> timeout;

    public Output<Integer> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * The kind of web test this is, valid choices are ping and multistep.
     * 
     */
    @Import(name="webTestKind", required=true)
      private final Output<WebTestKind> webTestKind;

    public Output<WebTestKind> getWebTestKind() {
        return this.webTestKind;
    }

    /**
     * User defined name if this WebTest.
     * 
     */
    @Import(name="webTestName")
      private final @Nullable Output<String> webTestName;

    public Output<String> getWebTestName() {
        return this.webTestName == null ? Output.empty() : this.webTestName;
    }

    public WebTestArgs(
        @Nullable Output<WebTestPropertiesConfigurationArgs> configuration,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Integer> frequency,
        @Nullable Output<WebTestKind> kind,
        @Nullable Output<String> location,
        Output<List<WebTestGeolocationArgs>> locations,
        Output<String> resourceGroupName,
        @Nullable Output<Boolean> retryEnabled,
        Output<String> syntheticMonitorId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Integer> timeout,
        Output<WebTestKind> webTestKind,
        @Nullable Output<String> webTestName) {
        this.configuration = configuration;
        this.description = description;
        this.enabled = enabled;
        this.frequency = frequency == null ? Output.ofNullable(300) : frequency;
        this.kind = kind == null ? Output.ofNullable(io.pulumi.azurenative.insights.enums.WebTestKind.Ping) : kind;
        this.location = location;
        this.locations = Objects.requireNonNull(locations, "expected parameter 'locations' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.retryEnabled = retryEnabled;
        this.syntheticMonitorId = Objects.requireNonNull(syntheticMonitorId, "expected parameter 'syntheticMonitorId' to be non-null");
        this.tags = tags;
        this.timeout = timeout == null ? Output.ofNullable(30) : timeout;
        this.webTestKind = webTestKind == null ? Output.ofNullable(io.pulumi.azurenative.insights.enums.WebTestKind.Ping) : Objects.requireNonNull(webTestKind, "expected parameter 'webTestKind' to be non-null");
        this.webTestName = webTestName;
    }

    private WebTestArgs() {
        this.configuration = Output.empty();
        this.description = Output.empty();
        this.enabled = Output.empty();
        this.frequency = Output.empty();
        this.kind = Output.empty();
        this.location = Output.empty();
        this.locations = Output.empty();
        this.resourceGroupName = Output.empty();
        this.retryEnabled = Output.empty();
        this.syntheticMonitorId = Output.empty();
        this.tags = Output.empty();
        this.timeout = Output.empty();
        this.webTestKind = Output.empty();
        this.webTestName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebTestPropertiesConfigurationArgs> configuration;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Integer> frequency;
        private @Nullable Output<WebTestKind> kind;
        private @Nullable Output<String> location;
        private Output<List<WebTestGeolocationArgs>> locations;
        private Output<String> resourceGroupName;
        private @Nullable Output<Boolean> retryEnabled;
        private Output<String> syntheticMonitorId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Integer> timeout;
        private Output<WebTestKind> webTestKind;
        private @Nullable Output<String> webTestName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.frequency = defaults.frequency;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.locations = defaults.locations;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.retryEnabled = defaults.retryEnabled;
    	      this.syntheticMonitorId = defaults.syntheticMonitorId;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.webTestKind = defaults.webTestKind;
    	      this.webTestName = defaults.webTestName;
        }

        public Builder configuration(@Nullable Output<WebTestPropertiesConfigurationArgs> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable WebTestPropertiesConfigurationArgs configuration) {
            this.configuration = Output.ofNullable(configuration);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder frequency(@Nullable Output<Integer> frequency) {
            this.frequency = frequency;
            return this;
        }
        public Builder frequency(@Nullable Integer frequency) {
            this.frequency = Output.ofNullable(frequency);
            return this;
        }
        public Builder kind(@Nullable Output<WebTestKind> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable WebTestKind kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder locations(Output<List<WebTestGeolocationArgs>> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(List<WebTestGeolocationArgs> locations) {
            this.locations = Output.of(Objects.requireNonNull(locations));
            return this;
        }
        public Builder locations(WebTestGeolocationArgs... locations) {
            return locations(List.of(locations));
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder retryEnabled(@Nullable Output<Boolean> retryEnabled) {
            this.retryEnabled = retryEnabled;
            return this;
        }
        public Builder retryEnabled(@Nullable Boolean retryEnabled) {
            this.retryEnabled = Output.ofNullable(retryEnabled);
            return this;
        }
        public Builder syntheticMonitorId(Output<String> syntheticMonitorId) {
            this.syntheticMonitorId = Objects.requireNonNull(syntheticMonitorId);
            return this;
        }
        public Builder syntheticMonitorId(String syntheticMonitorId) {
            this.syntheticMonitorId = Output.of(Objects.requireNonNull(syntheticMonitorId));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder timeout(@Nullable Output<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }
        public Builder webTestKind(Output<WebTestKind> webTestKind) {
            this.webTestKind = Objects.requireNonNull(webTestKind);
            return this;
        }
        public Builder webTestKind(WebTestKind webTestKind) {
            this.webTestKind = Output.of(Objects.requireNonNull(webTestKind));
            return this;
        }
        public Builder webTestName(@Nullable Output<String> webTestName) {
            this.webTestName = webTestName;
            return this;
        }
        public Builder webTestName(@Nullable String webTestName) {
            this.webTestName = Output.ofNullable(webTestName);
            return this;
        }        public WebTestArgs build() {
            return new WebTestArgs(configuration, description, enabled, frequency, kind, location, locations, resourceGroupName, retryEnabled, syntheticMonitorId, tags, timeout, webTestKind, webTestName);
        }
    }
}
