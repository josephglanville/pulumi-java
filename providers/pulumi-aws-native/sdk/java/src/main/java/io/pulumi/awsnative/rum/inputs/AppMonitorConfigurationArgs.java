// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rum.inputs;

import io.pulumi.awsnative.rum.enums.AppMonitorTelemetry;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AppMonitor configuration
 * 
 */
public final class AppMonitorConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppMonitorConfigurationArgs Empty = new AppMonitorConfigurationArgs();

    /**
     * If you set this to true, the RUM web client sets two cookies, a session cookie and a user cookie. The cookies allow the RUM web client to collect data relating to the number of users an application has and the behavior of the application across a sequence of events. Cookies are stored in the top-level domain of the current page.
     * 
     */
    @Import(name="allowCookies")
      private final @Nullable Output<Boolean> allowCookies;

    public Output<Boolean> getAllowCookies() {
        return this.allowCookies == null ? Output.empty() : this.allowCookies;
    }

    /**
     * If you set this to true, RUM enables xray tracing for the user sessions that RUM samples. RUM adds an xray trace header to allowed HTTP requests. It also records an xray segment for allowed HTTP requests. You can see traces and segments from these user sessions in the xray console and the CW ServiceLens console.
     * 
     */
    @Import(name="enableXRay")
      private final @Nullable Output<Boolean> enableXRay;

    public Output<Boolean> getEnableXRay() {
        return this.enableXRay == null ? Output.empty() : this.enableXRay;
    }

    /**
     * A list of URLs in your website or application to exclude from RUM data collection. You can't include both ExcludedPages and IncludedPages in the same operation.
     * 
     */
    @Import(name="excludedPages")
      private final @Nullable Output<List<String>> excludedPages;

    public Output<List<String>> getExcludedPages() {
        return this.excludedPages == null ? Output.empty() : this.excludedPages;
    }

    /**
     * A list of pages in the RUM console that are to be displayed with a favorite icon.
     * 
     */
    @Import(name="favoritePages")
      private final @Nullable Output<List<String>> favoritePages;

    public Output<List<String>> getFavoritePages() {
        return this.favoritePages == null ? Output.empty() : this.favoritePages;
    }

    /**
     * The ARN of the guest IAM role that is attached to the identity pool that is used to authorize the sending of data to RUM.
     * 
     */
    @Import(name="guestRoleArn")
      private final @Nullable Output<String> guestRoleArn;

    public Output<String> getGuestRoleArn() {
        return this.guestRoleArn == null ? Output.empty() : this.guestRoleArn;
    }

    /**
     * The ID of the identity pool that is used to authorize the sending of data to RUM.
     * 
     */
    @Import(name="identityPoolId")
      private final @Nullable Output<String> identityPoolId;

    public Output<String> getIdentityPoolId() {
        return this.identityPoolId == null ? Output.empty() : this.identityPoolId;
    }

    /**
     * If this app monitor is to collect data from only certain pages in your application, this structure lists those pages. You can't include both ExcludedPages and IncludedPages in the same operation.
     * 
     */
    @Import(name="includedPages")
      private final @Nullable Output<List<String>> includedPages;

    public Output<List<String>> getIncludedPages() {
        return this.includedPages == null ? Output.empty() : this.includedPages;
    }

    /**
     * Specifies the percentage of user sessions to use for RUM data collection. Choosing a higher percentage gives you more data but also incurs more costs. The number you specify is the percentage of user sessions that will be used. If you omit this parameter, the default of 10 is used.
     * 
     */
    @Import(name="sessionSampleRate")
      private final @Nullable Output<Double> sessionSampleRate;

    public Output<Double> getSessionSampleRate() {
        return this.sessionSampleRate == null ? Output.empty() : this.sessionSampleRate;
    }

    /**
     * An array that lists the types of telemetry data that this app monitor is to collect.
     * 
     */
    @Import(name="telemetries")
      private final @Nullable Output<List<AppMonitorTelemetry>> telemetries;

    public Output<List<AppMonitorTelemetry>> getTelemetries() {
        return this.telemetries == null ? Output.empty() : this.telemetries;
    }

    public AppMonitorConfigurationArgs(
        @Nullable Output<Boolean> allowCookies,
        @Nullable Output<Boolean> enableXRay,
        @Nullable Output<List<String>> excludedPages,
        @Nullable Output<List<String>> favoritePages,
        @Nullable Output<String> guestRoleArn,
        @Nullable Output<String> identityPoolId,
        @Nullable Output<List<String>> includedPages,
        @Nullable Output<Double> sessionSampleRate,
        @Nullable Output<List<AppMonitorTelemetry>> telemetries) {
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

    private AppMonitorConfigurationArgs() {
        this.allowCookies = Output.empty();
        this.enableXRay = Output.empty();
        this.excludedPages = Output.empty();
        this.favoritePages = Output.empty();
        this.guestRoleArn = Output.empty();
        this.identityPoolId = Output.empty();
        this.includedPages = Output.empty();
        this.sessionSampleRate = Output.empty();
        this.telemetries = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppMonitorConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowCookies;
        private @Nullable Output<Boolean> enableXRay;
        private @Nullable Output<List<String>> excludedPages;
        private @Nullable Output<List<String>> favoritePages;
        private @Nullable Output<String> guestRoleArn;
        private @Nullable Output<String> identityPoolId;
        private @Nullable Output<List<String>> includedPages;
        private @Nullable Output<Double> sessionSampleRate;
        private @Nullable Output<List<AppMonitorTelemetry>> telemetries;

        public Builder() {
    	      // Empty
        }

        public Builder(AppMonitorConfigurationArgs defaults) {
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

        public Builder allowCookies(@Nullable Output<Boolean> allowCookies) {
            this.allowCookies = allowCookies;
            return this;
        }
        public Builder allowCookies(@Nullable Boolean allowCookies) {
            this.allowCookies = Output.ofNullable(allowCookies);
            return this;
        }
        public Builder enableXRay(@Nullable Output<Boolean> enableXRay) {
            this.enableXRay = enableXRay;
            return this;
        }
        public Builder enableXRay(@Nullable Boolean enableXRay) {
            this.enableXRay = Output.ofNullable(enableXRay);
            return this;
        }
        public Builder excludedPages(@Nullable Output<List<String>> excludedPages) {
            this.excludedPages = excludedPages;
            return this;
        }
        public Builder excludedPages(@Nullable List<String> excludedPages) {
            this.excludedPages = Output.ofNullable(excludedPages);
            return this;
        }
        public Builder excludedPages(String... excludedPages) {
            return excludedPages(List.of(excludedPages));
        }
        public Builder favoritePages(@Nullable Output<List<String>> favoritePages) {
            this.favoritePages = favoritePages;
            return this;
        }
        public Builder favoritePages(@Nullable List<String> favoritePages) {
            this.favoritePages = Output.ofNullable(favoritePages);
            return this;
        }
        public Builder favoritePages(String... favoritePages) {
            return favoritePages(List.of(favoritePages));
        }
        public Builder guestRoleArn(@Nullable Output<String> guestRoleArn) {
            this.guestRoleArn = guestRoleArn;
            return this;
        }
        public Builder guestRoleArn(@Nullable String guestRoleArn) {
            this.guestRoleArn = Output.ofNullable(guestRoleArn);
            return this;
        }
        public Builder identityPoolId(@Nullable Output<String> identityPoolId) {
            this.identityPoolId = identityPoolId;
            return this;
        }
        public Builder identityPoolId(@Nullable String identityPoolId) {
            this.identityPoolId = Output.ofNullable(identityPoolId);
            return this;
        }
        public Builder includedPages(@Nullable Output<List<String>> includedPages) {
            this.includedPages = includedPages;
            return this;
        }
        public Builder includedPages(@Nullable List<String> includedPages) {
            this.includedPages = Output.ofNullable(includedPages);
            return this;
        }
        public Builder includedPages(String... includedPages) {
            return includedPages(List.of(includedPages));
        }
        public Builder sessionSampleRate(@Nullable Output<Double> sessionSampleRate) {
            this.sessionSampleRate = sessionSampleRate;
            return this;
        }
        public Builder sessionSampleRate(@Nullable Double sessionSampleRate) {
            this.sessionSampleRate = Output.ofNullable(sessionSampleRate);
            return this;
        }
        public Builder telemetries(@Nullable Output<List<AppMonitorTelemetry>> telemetries) {
            this.telemetries = telemetries;
            return this;
        }
        public Builder telemetries(@Nullable List<AppMonitorTelemetry> telemetries) {
            this.telemetries = Output.ofNullable(telemetries);
            return this;
        }
        public Builder telemetries(AppMonitorTelemetry... telemetries) {
            return telemetries(List.of(telemetries));
        }        public AppMonitorConfigurationArgs build() {
            return new AppMonitorConfigurationArgs(allowCookies, enableXRay, excludedPages, favoritePages, guestRoleArn, identityPoolId, includedPages, sessionSampleRate, telemetries);
        }
    }
}
