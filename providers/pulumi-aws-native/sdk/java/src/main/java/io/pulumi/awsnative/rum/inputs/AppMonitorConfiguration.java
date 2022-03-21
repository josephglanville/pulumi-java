// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rum.inputs;

import io.pulumi.awsnative.rum.enums.AppMonitorTelemetry;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AppMonitor configuration
 * 
 */
public final class AppMonitorConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final AppMonitorConfiguration Empty = new AppMonitorConfiguration();

    /**
     * If you set this to true, the RUM web client sets two cookies, a session cookie and a user cookie. The cookies allow the RUM web client to collect data relating to the number of users an application has and the behavior of the application across a sequence of events. Cookies are stored in the top-level domain of the current page.
     * 
     */
    @Import(name="allowCookies")
      private final @Nullable Boolean allowCookies;

    public Optional<Boolean> getAllowCookies() {
        return this.allowCookies == null ? Optional.empty() : Optional.ofNullable(this.allowCookies);
    }

    /**
     * If you set this to true, RUM enables xray tracing for the user sessions that RUM samples. RUM adds an xray trace header to allowed HTTP requests. It also records an xray segment for allowed HTTP requests. You can see traces and segments from these user sessions in the xray console and the CW ServiceLens console.
     * 
     */
    @Import(name="enableXRay")
      private final @Nullable Boolean enableXRay;

    public Optional<Boolean> getEnableXRay() {
        return this.enableXRay == null ? Optional.empty() : Optional.ofNullable(this.enableXRay);
    }

    /**
     * A list of URLs in your website or application to exclude from RUM data collection. You can't include both ExcludedPages and IncludedPages in the same operation.
     * 
     */
    @Import(name="excludedPages")
      private final @Nullable List<String> excludedPages;

    public List<String> getExcludedPages() {
        return this.excludedPages == null ? List.of() : this.excludedPages;
    }

    /**
     * A list of pages in the RUM console that are to be displayed with a favorite icon.
     * 
     */
    @Import(name="favoritePages")
      private final @Nullable List<String> favoritePages;

    public List<String> getFavoritePages() {
        return this.favoritePages == null ? List.of() : this.favoritePages;
    }

    /**
     * The ARN of the guest IAM role that is attached to the identity pool that is used to authorize the sending of data to RUM.
     * 
     */
    @Import(name="guestRoleArn")
      private final @Nullable String guestRoleArn;

    public Optional<String> getGuestRoleArn() {
        return this.guestRoleArn == null ? Optional.empty() : Optional.ofNullable(this.guestRoleArn);
    }

    /**
     * The ID of the identity pool that is used to authorize the sending of data to RUM.
     * 
     */
    @Import(name="identityPoolId")
      private final @Nullable String identityPoolId;

    public Optional<String> getIdentityPoolId() {
        return this.identityPoolId == null ? Optional.empty() : Optional.ofNullable(this.identityPoolId);
    }

    /**
     * If this app monitor is to collect data from only certain pages in your application, this structure lists those pages. You can't include both ExcludedPages and IncludedPages in the same operation.
     * 
     */
    @Import(name="includedPages")
      private final @Nullable List<String> includedPages;

    public List<String> getIncludedPages() {
        return this.includedPages == null ? List.of() : this.includedPages;
    }

    /**
     * Specifies the percentage of user sessions to use for RUM data collection. Choosing a higher percentage gives you more data but also incurs more costs. The number you specify is the percentage of user sessions that will be used. If you omit this parameter, the default of 10 is used.
     * 
     */
    @Import(name="sessionSampleRate")
      private final @Nullable Double sessionSampleRate;

    public Optional<Double> getSessionSampleRate() {
        return this.sessionSampleRate == null ? Optional.empty() : Optional.ofNullable(this.sessionSampleRate);
    }

    /**
     * An array that lists the types of telemetry data that this app monitor is to collect.
     * 
     */
    @Import(name="telemetries")
      private final @Nullable List<AppMonitorTelemetry> telemetries;

    public List<AppMonitorTelemetry> getTelemetries() {
        return this.telemetries == null ? List.of() : this.telemetries;
    }

    public AppMonitorConfiguration(
        @Nullable Boolean allowCookies,
        @Nullable Boolean enableXRay,
        @Nullable List<String> excludedPages,
        @Nullable List<String> favoritePages,
        @Nullable String guestRoleArn,
        @Nullable String identityPoolId,
        @Nullable List<String> includedPages,
        @Nullable Double sessionSampleRate,
        @Nullable List<AppMonitorTelemetry> telemetries) {
        this.allowCookies = allowCookies;
        this.enableXRay = enableXRay;
        this.excludedPages = excludedPages;
        this.favoritePages = favoritePages;
        this.guestRoleArn = guestRoleArn;
        this.identityPoolId = identityPoolId;
        this.includedPages = includedPages;
        this.sessionSampleRate = sessionSampleRate;
        this.telemetries = telemetries;
    }

    private AppMonitorConfiguration() {
        this.allowCookies = null;
        this.enableXRay = null;
        this.excludedPages = List.of();
        this.favoritePages = List.of();
        this.guestRoleArn = null;
        this.identityPoolId = null;
        this.includedPages = List.of();
        this.sessionSampleRate = null;
        this.telemetries = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppMonitorConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowCookies;
        private @Nullable Boolean enableXRay;
        private @Nullable List<String> excludedPages;
        private @Nullable List<String> favoritePages;
        private @Nullable String guestRoleArn;
        private @Nullable String identityPoolId;
        private @Nullable List<String> includedPages;
        private @Nullable Double sessionSampleRate;
        private @Nullable List<AppMonitorTelemetry> telemetries;

        public Builder() {
    	      // Empty
        }

        public Builder(AppMonitorConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCookies = defaults.allowCookies;
    	      this.enableXRay = defaults.enableXRay;
    	      this.excludedPages = defaults.excludedPages;
    	      this.favoritePages = defaults.favoritePages;
    	      this.guestRoleArn = defaults.guestRoleArn;
    	      this.identityPoolId = defaults.identityPoolId;
    	      this.includedPages = defaults.includedPages;
    	      this.sessionSampleRate = defaults.sessionSampleRate;
    	      this.telemetries = defaults.telemetries;
        }

        public Builder allowCookies(@Nullable Boolean allowCookies) {
            this.allowCookies = allowCookies;
            return this;
        }
        public Builder enableXRay(@Nullable Boolean enableXRay) {
            this.enableXRay = enableXRay;
            return this;
        }
        public Builder excludedPages(@Nullable List<String> excludedPages) {
            this.excludedPages = excludedPages;
            return this;
        }
        public Builder excludedPages(String... excludedPages) {
            return excludedPages(List.of(excludedPages));
        }
        public Builder favoritePages(@Nullable List<String> favoritePages) {
            this.favoritePages = favoritePages;
            return this;
        }
        public Builder favoritePages(String... favoritePages) {
            return favoritePages(List.of(favoritePages));
        }
        public Builder guestRoleArn(@Nullable String guestRoleArn) {
            this.guestRoleArn = guestRoleArn;
            return this;
        }
        public Builder identityPoolId(@Nullable String identityPoolId) {
            this.identityPoolId = identityPoolId;
            return this;
        }
        public Builder includedPages(@Nullable List<String> includedPages) {
            this.includedPages = includedPages;
            return this;
        }
        public Builder includedPages(String... includedPages) {
            return includedPages(List.of(includedPages));
        }
        public Builder sessionSampleRate(@Nullable Double sessionSampleRate) {
            this.sessionSampleRate = sessionSampleRate;
            return this;
        }
        public Builder telemetries(@Nullable List<AppMonitorTelemetry> telemetries) {
            this.telemetries = telemetries;
            return this;
        }
        public Builder telemetries(AppMonitorTelemetry... telemetries) {
            return telemetries(List.of(telemetries));
        }        public AppMonitorConfiguration build() {
            return new AppMonitorConfiguration(allowCookies, enableXRay, excludedPages, favoritePages, guestRoleArn, identityPoolId, includedPages, sessionSampleRate, telemetries);
        }
    }
}
