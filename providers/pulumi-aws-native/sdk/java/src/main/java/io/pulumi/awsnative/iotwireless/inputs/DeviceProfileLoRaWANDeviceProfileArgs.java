// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceProfileLoRaWANDeviceProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceProfileLoRaWANDeviceProfileArgs Empty = new DeviceProfileLoRaWANDeviceProfileArgs();

    @Import(name="classBTimeout")
      private final @Nullable Output<Integer> classBTimeout;

    public Output<Integer> getClassBTimeout() {
        return this.classBTimeout == null ? Output.empty() : this.classBTimeout;
    }

    @Import(name="classCTimeout")
      private final @Nullable Output<Integer> classCTimeout;

    public Output<Integer> getClassCTimeout() {
        return this.classCTimeout == null ? Output.empty() : this.classCTimeout;
    }

    @Import(name="macVersion")
      private final @Nullable Output<String> macVersion;

    public Output<String> getMacVersion() {
        return this.macVersion == null ? Output.empty() : this.macVersion;
    }

    @Import(name="maxDutyCycle")
      private final @Nullable Output<Integer> maxDutyCycle;

    public Output<Integer> getMaxDutyCycle() {
        return this.maxDutyCycle == null ? Output.empty() : this.maxDutyCycle;
    }

    @Import(name="maxEirp")
      private final @Nullable Output<Integer> maxEirp;

    public Output<Integer> getMaxEirp() {
        return this.maxEirp == null ? Output.empty() : this.maxEirp;
    }

    @Import(name="pingSlotDr")
      private final @Nullable Output<Integer> pingSlotDr;

    public Output<Integer> getPingSlotDr() {
        return this.pingSlotDr == null ? Output.empty() : this.pingSlotDr;
    }

    @Import(name="pingSlotFreq")
      private final @Nullable Output<Integer> pingSlotFreq;

    public Output<Integer> getPingSlotFreq() {
        return this.pingSlotFreq == null ? Output.empty() : this.pingSlotFreq;
    }

    @Import(name="pingSlotPeriod")
      private final @Nullable Output<Integer> pingSlotPeriod;

    public Output<Integer> getPingSlotPeriod() {
        return this.pingSlotPeriod == null ? Output.empty() : this.pingSlotPeriod;
    }

    @Import(name="regParamsRevision")
      private final @Nullable Output<String> regParamsRevision;

    public Output<String> getRegParamsRevision() {
        return this.regParamsRevision == null ? Output.empty() : this.regParamsRevision;
    }

    @Import(name="rfRegion")
      private final @Nullable Output<String> rfRegion;

    public Output<String> getRfRegion() {
        return this.rfRegion == null ? Output.empty() : this.rfRegion;
    }

    @Import(name="supports32BitFCnt")
      private final @Nullable Output<Boolean> supports32BitFCnt;

    public Output<Boolean> getSupports32BitFCnt() {
        return this.supports32BitFCnt == null ? Output.empty() : this.supports32BitFCnt;
    }

    @Import(name="supportsClassB")
      private final @Nullable Output<Boolean> supportsClassB;

    public Output<Boolean> getSupportsClassB() {
        return this.supportsClassB == null ? Output.empty() : this.supportsClassB;
    }

    @Import(name="supportsClassC")
      private final @Nullable Output<Boolean> supportsClassC;

    public Output<Boolean> getSupportsClassC() {
        return this.supportsClassC == null ? Output.empty() : this.supportsClassC;
    }

    @Import(name="supportsJoin")
      private final @Nullable Output<Boolean> supportsJoin;

    public Output<Boolean> getSupportsJoin() {
        return this.supportsJoin == null ? Output.empty() : this.supportsJoin;
    }

    public DeviceProfileLoRaWANDeviceProfileArgs(
        @Nullable Output<Integer> classBTimeout,
        @Nullable Output<Integer> classCTimeout,
        @Nullable Output<String> macVersion,
        @Nullable Output<Integer> maxDutyCycle,
        @Nullable Output<Integer> maxEirp,
        @Nullable Output<Integer> pingSlotDr,
        @Nullable Output<Integer> pingSlotFreq,
        @Nullable Output<Integer> pingSlotPeriod,
        @Nullable Output<String> regParamsRevision,
        @Nullable Output<String> rfRegion,
        @Nullable Output<Boolean> supports32BitFCnt,
        @Nullable Output<Boolean> supportsClassB,
        @Nullable Output<Boolean> supportsClassC,
        @Nullable Output<Boolean> supportsJoin) {
        this.classBTimeout = classBTimeout;
        this.classCTimeout = classCTimeout;
        this.macVersion = macVersion;
        this.maxDutyCycle = maxDutyCycle;
        this.maxEirp = maxEirp;
        this.pingSlotDr = pingSlotDr;
        this.pingSlotFreq = pingSlotFreq;
        this.pingSlotPeriod = pingSlotPeriod;
        this.regParamsRevision = regParamsRevision;
        this.rfRegion = rfRegion;
        this.supports32BitFCnt = supports32BitFCnt;
        this.supportsClassB = supportsClassB;
        this.supportsClassC = supportsClassC;
        this.supportsJoin = supportsJoin;
    }

    private DeviceProfileLoRaWANDeviceProfileArgs() {
        this.classBTimeout = Output.empty();
        this.classCTimeout = Output.empty();
        this.macVersion = Output.empty();
        this.maxDutyCycle = Output.empty();
        this.maxEirp = Output.empty();
        this.pingSlotDr = Output.empty();
        this.pingSlotFreq = Output.empty();
        this.pingSlotPeriod = Output.empty();
        this.regParamsRevision = Output.empty();
        this.rfRegion = Output.empty();
        this.supports32BitFCnt = Output.empty();
        this.supportsClassB = Output.empty();
        this.supportsClassC = Output.empty();
        this.supportsJoin = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceProfileLoRaWANDeviceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> classBTimeout;
        private @Nullable Output<Integer> classCTimeout;
        private @Nullable Output<String> macVersion;
        private @Nullable Output<Integer> maxDutyCycle;
        private @Nullable Output<Integer> maxEirp;
        private @Nullable Output<Integer> pingSlotDr;
        private @Nullable Output<Integer> pingSlotFreq;
        private @Nullable Output<Integer> pingSlotPeriod;
        private @Nullable Output<String> regParamsRevision;
        private @Nullable Output<String> rfRegion;
        private @Nullable Output<Boolean> supports32BitFCnt;
        private @Nullable Output<Boolean> supportsClassB;
        private @Nullable Output<Boolean> supportsClassC;
        private @Nullable Output<Boolean> supportsJoin;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceProfileLoRaWANDeviceProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classBTimeout = defaults.classBTimeout;
    	      this.classCTimeout = defaults.classCTimeout;
    	      this.macVersion = defaults.macVersion;
    	      this.maxDutyCycle = defaults.maxDutyCycle;
    	      this.maxEirp = defaults.maxEirp;
    	      this.pingSlotDr = defaults.pingSlotDr;
    	      this.pingSlotFreq = defaults.pingSlotFreq;
    	      this.pingSlotPeriod = defaults.pingSlotPeriod;
    	      this.regParamsRevision = defaults.regParamsRevision;
    	      this.rfRegion = defaults.rfRegion;
    	      this.supports32BitFCnt = defaults.supports32BitFCnt;
    	      this.supportsClassB = defaults.supportsClassB;
    	      this.supportsClassC = defaults.supportsClassC;
    	      this.supportsJoin = defaults.supportsJoin;
        }

        public Builder classBTimeout(@Nullable Output<Integer> classBTimeout) {
            this.classBTimeout = classBTimeout;
            return this;
        }
        public Builder classBTimeout(@Nullable Integer classBTimeout) {
            this.classBTimeout = Output.ofNullable(classBTimeout);
            return this;
        }
        public Builder classCTimeout(@Nullable Output<Integer> classCTimeout) {
            this.classCTimeout = classCTimeout;
            return this;
        }
        public Builder classCTimeout(@Nullable Integer classCTimeout) {
            this.classCTimeout = Output.ofNullable(classCTimeout);
            return this;
        }
        public Builder macVersion(@Nullable Output<String> macVersion) {
            this.macVersion = macVersion;
            return this;
        }
        public Builder macVersion(@Nullable String macVersion) {
            this.macVersion = Output.ofNullable(macVersion);
            return this;
        }
        public Builder maxDutyCycle(@Nullable Output<Integer> maxDutyCycle) {
            this.maxDutyCycle = maxDutyCycle;
            return this;
        }
        public Builder maxDutyCycle(@Nullable Integer maxDutyCycle) {
            this.maxDutyCycle = Output.ofNullable(maxDutyCycle);
            return this;
        }
        public Builder maxEirp(@Nullable Output<Integer> maxEirp) {
            this.maxEirp = maxEirp;
            return this;
        }
        public Builder maxEirp(@Nullable Integer maxEirp) {
            this.maxEirp = Output.ofNullable(maxEirp);
            return this;
        }
        public Builder pingSlotDr(@Nullable Output<Integer> pingSlotDr) {
            this.pingSlotDr = pingSlotDr;
            return this;
        }
        public Builder pingSlotDr(@Nullable Integer pingSlotDr) {
            this.pingSlotDr = Output.ofNullable(pingSlotDr);
            return this;
        }
        public Builder pingSlotFreq(@Nullable Output<Integer> pingSlotFreq) {
            this.pingSlotFreq = pingSlotFreq;
            return this;
        }
        public Builder pingSlotFreq(@Nullable Integer pingSlotFreq) {
            this.pingSlotFreq = Output.ofNullable(pingSlotFreq);
            return this;
        }
        public Builder pingSlotPeriod(@Nullable Output<Integer> pingSlotPeriod) {
            this.pingSlotPeriod = pingSlotPeriod;
            return this;
        }
        public Builder pingSlotPeriod(@Nullable Integer pingSlotPeriod) {
            this.pingSlotPeriod = Output.ofNullable(pingSlotPeriod);
            return this;
        }
        public Builder regParamsRevision(@Nullable Output<String> regParamsRevision) {
            this.regParamsRevision = regParamsRevision;
            return this;
        }
        public Builder regParamsRevision(@Nullable String regParamsRevision) {
            this.regParamsRevision = Output.ofNullable(regParamsRevision);
            return this;
        }
        public Builder rfRegion(@Nullable Output<String> rfRegion) {
            this.rfRegion = rfRegion;
            return this;
        }
        public Builder rfRegion(@Nullable String rfRegion) {
            this.rfRegion = Output.ofNullable(rfRegion);
            return this;
        }
        public Builder supports32BitFCnt(@Nullable Output<Boolean> supports32BitFCnt) {
            this.supports32BitFCnt = supports32BitFCnt;
            return this;
        }
        public Builder supports32BitFCnt(@Nullable Boolean supports32BitFCnt) {
            this.supports32BitFCnt = Output.ofNullable(supports32BitFCnt);
            return this;
        }
        public Builder supportsClassB(@Nullable Output<Boolean> supportsClassB) {
            this.supportsClassB = supportsClassB;
            return this;
        }
        public Builder supportsClassB(@Nullable Boolean supportsClassB) {
            this.supportsClassB = Output.ofNullable(supportsClassB);
            return this;
        }
        public Builder supportsClassC(@Nullable Output<Boolean> supportsClassC) {
            this.supportsClassC = supportsClassC;
            return this;
        }
        public Builder supportsClassC(@Nullable Boolean supportsClassC) {
            this.supportsClassC = Output.ofNullable(supportsClassC);
            return this;
        }
        public Builder supportsJoin(@Nullable Output<Boolean> supportsJoin) {
            this.supportsJoin = supportsJoin;
            return this;
        }
        public Builder supportsJoin(@Nullable Boolean supportsJoin) {
            this.supportsJoin = Output.ofNullable(supportsJoin);
            return this;
        }        public DeviceProfileLoRaWANDeviceProfileArgs build() {
            return new DeviceProfileLoRaWANDeviceProfileArgs(classBTimeout, classCTimeout, macVersion, maxDutyCycle, maxEirp, pingSlotDr, pingSlotFreq, pingSlotPeriod, regParamsRevision, rfRegion, supports32BitFCnt, supportsClassB, supportsClassC, supportsJoin);
        }
    }
}
