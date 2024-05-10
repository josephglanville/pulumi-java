// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorCaching {
    private @Nullable String behavior;
    private @Nullable String cacheControlDirectives;
    private @Nullable String cacheabilitySettings;
    private @Nullable String defaultTtl;
    private @Nullable Boolean enhancedRfcSupport;
    private @Nullable String expirationSettings;
    private @Nullable Boolean honorMaxAge;
    private @Nullable Boolean honorMustRevalidate;
    private @Nullable Boolean honorNoCache;
    private @Nullable Boolean honorNoStore;
    private @Nullable Boolean honorPrivate;
    private @Nullable Boolean honorProxyRevalidate;
    private @Nullable Boolean honorSMaxage;
    private @Nullable Boolean locked;
    private @Nullable Boolean mustRevalidate;
    private @Nullable String revalidationSettings;
    private @Nullable String templateUuid;
    private @Nullable String ttl;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorCaching() {}
    public Optional<String> behavior() {
        return Optional.ofNullable(this.behavior);
    }
    public Optional<String> cacheControlDirectives() {
        return Optional.ofNullable(this.cacheControlDirectives);
    }
    public Optional<String> cacheabilitySettings() {
        return Optional.ofNullable(this.cacheabilitySettings);
    }
    public Optional<String> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }
    public Optional<Boolean> enhancedRfcSupport() {
        return Optional.ofNullable(this.enhancedRfcSupport);
    }
    public Optional<String> expirationSettings() {
        return Optional.ofNullable(this.expirationSettings);
    }
    public Optional<Boolean> honorMaxAge() {
        return Optional.ofNullable(this.honorMaxAge);
    }
    public Optional<Boolean> honorMustRevalidate() {
        return Optional.ofNullable(this.honorMustRevalidate);
    }
    public Optional<Boolean> honorNoCache() {
        return Optional.ofNullable(this.honorNoCache);
    }
    public Optional<Boolean> honorNoStore() {
        return Optional.ofNullable(this.honorNoStore);
    }
    public Optional<Boolean> honorPrivate() {
        return Optional.ofNullable(this.honorPrivate);
    }
    public Optional<Boolean> honorProxyRevalidate() {
        return Optional.ofNullable(this.honorProxyRevalidate);
    }
    public Optional<Boolean> honorSMaxage() {
        return Optional.ofNullable(this.honorSMaxage);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Boolean> mustRevalidate() {
        return Optional.ofNullable(this.mustRevalidate);
    }
    public Optional<String> revalidationSettings() {
        return Optional.ofNullable(this.revalidationSettings);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> ttl() {
        return Optional.ofNullable(this.ttl);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorCaching defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String behavior;
        private @Nullable String cacheControlDirectives;
        private @Nullable String cacheabilitySettings;
        private @Nullable String defaultTtl;
        private @Nullable Boolean enhancedRfcSupport;
        private @Nullable String expirationSettings;
        private @Nullable Boolean honorMaxAge;
        private @Nullable Boolean honorMustRevalidate;
        private @Nullable Boolean honorNoCache;
        private @Nullable Boolean honorNoStore;
        private @Nullable Boolean honorPrivate;
        private @Nullable Boolean honorProxyRevalidate;
        private @Nullable Boolean honorSMaxage;
        private @Nullable Boolean locked;
        private @Nullable Boolean mustRevalidate;
        private @Nullable String revalidationSettings;
        private @Nullable String templateUuid;
        private @Nullable String ttl;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorCaching defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.cacheControlDirectives = defaults.cacheControlDirectives;
    	      this.cacheabilitySettings = defaults.cacheabilitySettings;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.enhancedRfcSupport = defaults.enhancedRfcSupport;
    	      this.expirationSettings = defaults.expirationSettings;
    	      this.honorMaxAge = defaults.honorMaxAge;
    	      this.honorMustRevalidate = defaults.honorMustRevalidate;
    	      this.honorNoCache = defaults.honorNoCache;
    	      this.honorNoStore = defaults.honorNoStore;
    	      this.honorPrivate = defaults.honorPrivate;
    	      this.honorProxyRevalidate = defaults.honorProxyRevalidate;
    	      this.honorSMaxage = defaults.honorSMaxage;
    	      this.locked = defaults.locked;
    	      this.mustRevalidate = defaults.mustRevalidate;
    	      this.revalidationSettings = defaults.revalidationSettings;
    	      this.templateUuid = defaults.templateUuid;
    	      this.ttl = defaults.ttl;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder behavior(@Nullable String behavior) {

            this.behavior = behavior;
            return this;
        }
        @CustomType.Setter
        public Builder cacheControlDirectives(@Nullable String cacheControlDirectives) {

            this.cacheControlDirectives = cacheControlDirectives;
            return this;
        }
        @CustomType.Setter
        public Builder cacheabilitySettings(@Nullable String cacheabilitySettings) {

            this.cacheabilitySettings = cacheabilitySettings;
            return this;
        }
        @CustomType.Setter
        public Builder defaultTtl(@Nullable String defaultTtl) {

            this.defaultTtl = defaultTtl;
            return this;
        }
        @CustomType.Setter
        public Builder enhancedRfcSupport(@Nullable Boolean enhancedRfcSupport) {

            this.enhancedRfcSupport = enhancedRfcSupport;
            return this;
        }
        @CustomType.Setter
        public Builder expirationSettings(@Nullable String expirationSettings) {

            this.expirationSettings = expirationSettings;
            return this;
        }
        @CustomType.Setter
        public Builder honorMaxAge(@Nullable Boolean honorMaxAge) {

            this.honorMaxAge = honorMaxAge;
            return this;
        }
        @CustomType.Setter
        public Builder honorMustRevalidate(@Nullable Boolean honorMustRevalidate) {

            this.honorMustRevalidate = honorMustRevalidate;
            return this;
        }
        @CustomType.Setter
        public Builder honorNoCache(@Nullable Boolean honorNoCache) {

            this.honorNoCache = honorNoCache;
            return this;
        }
        @CustomType.Setter
        public Builder honorNoStore(@Nullable Boolean honorNoStore) {

            this.honorNoStore = honorNoStore;
            return this;
        }
        @CustomType.Setter
        public Builder honorPrivate(@Nullable Boolean honorPrivate) {

            this.honorPrivate = honorPrivate;
            return this;
        }
        @CustomType.Setter
        public Builder honorProxyRevalidate(@Nullable Boolean honorProxyRevalidate) {

            this.honorProxyRevalidate = honorProxyRevalidate;
            return this;
        }
        @CustomType.Setter
        public Builder honorSMaxage(@Nullable Boolean honorSMaxage) {

            this.honorSMaxage = honorSMaxage;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder mustRevalidate(@Nullable Boolean mustRevalidate) {

            this.mustRevalidate = mustRevalidate;
            return this;
        }
        @CustomType.Setter
        public Builder revalidationSettings(@Nullable String revalidationSettings) {

            this.revalidationSettings = revalidationSettings;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder ttl(@Nullable String ttl) {

            this.ttl = ttl;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorCaching build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorCaching();
            _resultValue.behavior = behavior;
            _resultValue.cacheControlDirectives = cacheControlDirectives;
            _resultValue.cacheabilitySettings = cacheabilitySettings;
            _resultValue.defaultTtl = defaultTtl;
            _resultValue.enhancedRfcSupport = enhancedRfcSupport;
            _resultValue.expirationSettings = expirationSettings;
            _resultValue.honorMaxAge = honorMaxAge;
            _resultValue.honorMustRevalidate = honorMustRevalidate;
            _resultValue.honorNoCache = honorNoCache;
            _resultValue.honorNoStore = honorNoStore;
            _resultValue.honorPrivate = honorPrivate;
            _resultValue.honorProxyRevalidate = honorProxyRevalidate;
            _resultValue.honorSMaxage = honorSMaxage;
            _resultValue.locked = locked;
            _resultValue.mustRevalidate = mustRevalidate;
            _resultValue.revalidationSettings = revalidationSettings;
            _resultValue.templateUuid = templateUuid;
            _resultValue.ttl = ttl;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
