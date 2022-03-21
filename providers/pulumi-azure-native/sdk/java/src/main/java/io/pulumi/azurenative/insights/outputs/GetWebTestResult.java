// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.WebTestGeolocationResponse;
import io.pulumi.azurenative.insights.outputs.WebTestPropertiesResponseConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebTestResult {
    /**
     * An XML configuration specification for a WebTest.
     * 
     */
    private final @Nullable WebTestPropertiesResponseConfiguration configuration;
    /**
     * Purpose/user defined descriptive test for this WebTest.
     * 
     */
    private final @Nullable String description;
    /**
     * Is the test actively being monitored.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Interval in seconds between test runs for this WebTest. Default value is 300.
     * 
     */
    private final @Nullable Integer frequency;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * The kind of web test that this web test watches. Choices are ping and multistep.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * A list of where to physically run the tests from to give global coverage for accessibility of your application.
     * 
     */
    private final List<WebTestGeolocationResponse> locations;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * Current state of this component, whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
     */
    private final String provisioningState;
    /**
     * Allow for retries should this WebTest fail.
     * 
     */
    private final @Nullable Boolean retryEnabled;
    /**
     * Unique ID of this WebTest. This is typically the same value as the Name field.
     * 
     */
    private final String syntheticMonitorId;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Seconds until this WebTest will timeout and fail. Default value is 30.
     * 
     */
    private final @Nullable Integer timeout;
    /**
     * Azure resource type
     * 
     */
    private final String type;
    /**
     * The kind of web test this is, valid choices are ping and multistep.
     * 
     */
    private final String webTestKind;
    /**
     * User defined name if this WebTest.
     * 
     */
    private final String webTestName;

    @CustomType.Constructor
    private GetWebTestResult(
        @CustomType.Parameter("configuration") @Nullable WebTestPropertiesResponseConfiguration configuration,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("frequency") @Nullable Integer frequency,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("locations") List<WebTestGeolocationResponse> locations,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("retryEnabled") @Nullable Boolean retryEnabled,
        @CustomType.Parameter("syntheticMonitorId") String syntheticMonitorId,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("timeout") @Nullable Integer timeout,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("webTestKind") String webTestKind,
        @CustomType.Parameter("webTestName") String webTestName) {
        this.configuration = configuration;
        this.description = description;
        this.enabled = enabled;
        this.frequency = frequency;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.locations = locations;
        this.name = name;
        this.provisioningState = provisioningState;
        this.retryEnabled = retryEnabled;
        this.syntheticMonitorId = syntheticMonitorId;
        this.tags = tags;
        this.timeout = timeout;
        this.type = type;
        this.webTestKind = webTestKind;
        this.webTestName = webTestName;
    }

    /**
     * An XML configuration specification for a WebTest.
     * 
    */
    public Optional<WebTestPropertiesResponseConfiguration> getConfiguration() {
        return Optional.ofNullable(this.configuration);
    }
    /**
     * Purpose/user defined descriptive test for this WebTest.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Is the test actively being monitored.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Interval in seconds between test runs for this WebTest. Default value is 300.
     * 
    */
    public Optional<Integer> getFrequency() {
        return Optional.ofNullable(this.frequency);
    }
    /**
     * Azure resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The kind of web test that this web test watches. Choices are ping and multistep.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * A list of where to physically run the tests from to give global coverage for accessibility of your application.
     * 
    */
    public List<WebTestGeolocationResponse> getLocations() {
        return this.locations;
    }
    /**
     * Azure resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Current state of this component, whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Allow for retries should this WebTest fail.
     * 
    */
    public Optional<Boolean> getRetryEnabled() {
        return Optional.ofNullable(this.retryEnabled);
    }
    /**
     * Unique ID of this WebTest. This is typically the same value as the Name field.
     * 
    */
    public String getSyntheticMonitorId() {
        return this.syntheticMonitorId;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Seconds until this WebTest will timeout and fail. Default value is 30.
     * 
    */
    public Optional<Integer> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * Azure resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The kind of web test this is, valid choices are ping and multistep.
     * 
    */
    public String getWebTestKind() {
        return this.webTestKind;
    }
    /**
     * User defined name if this WebTest.
     * 
    */
    public String getWebTestName() {
        return this.webTestName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebTestResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebTestPropertiesResponseConfiguration configuration;
        private @Nullable String description;
        private @Nullable Boolean enabled;
        private @Nullable Integer frequency;
        private String id;
        private @Nullable String kind;
        private String location;
        private List<WebTestGeolocationResponse> locations;
        private String name;
        private String provisioningState;
        private @Nullable Boolean retryEnabled;
        private String syntheticMonitorId;
        private @Nullable Map<String,String> tags;
        private @Nullable Integer timeout;
        private String type;
        private String webTestKind;
        private String webTestName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebTestResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.frequency = defaults.frequency;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.retryEnabled = defaults.retryEnabled;
    	      this.syntheticMonitorId = defaults.syntheticMonitorId;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.webTestKind = defaults.webTestKind;
    	      this.webTestName = defaults.webTestName;
        }

        public Builder configuration(@Nullable WebTestPropertiesResponseConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder frequency(@Nullable Integer frequency) {
            this.frequency = frequency;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder locations(List<WebTestGeolocationResponse> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(WebTestGeolocationResponse... locations) {
            return locations(List.of(locations));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder retryEnabled(@Nullable Boolean retryEnabled) {
            this.retryEnabled = retryEnabled;
            return this;
        }
        public Builder syntheticMonitorId(String syntheticMonitorId) {
            this.syntheticMonitorId = Objects.requireNonNull(syntheticMonitorId);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder webTestKind(String webTestKind) {
            this.webTestKind = Objects.requireNonNull(webTestKind);
            return this;
        }
        public Builder webTestName(String webTestName) {
            this.webTestName = Objects.requireNonNull(webTestName);
            return this;
        }        public GetWebTestResult build() {
            return new GetWebTestResult(configuration, description, enabled, frequency, id, kind, location, locations, name, provisioningState, retryEnabled, syntheticMonitorId, tags, timeout, type, webTestKind, webTestName);
        }
    }
}
