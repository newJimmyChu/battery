package com.example.battery.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author chuzefang
 * @since 2021-05-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GroupBattery implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer ID;

    private Integer ContrallerID;

    private String AliName;

    private String devID;

    private String useDate;

    private String proDate;

    private String batModel;

    private String batStandard;

    private String facID;

    private Integer groBatteryQuantity;

    private Integer runState;

    private Float groCurrent;

    private Float groVoltage;

    private Float BalanceDegree;

    private String IMSI;

    private LocalDateTime DataTime;

    private Float DefVoltage;

    private Float Tem0;

    private Float Vol0;

    private Float SOC0;

    private Float Tem1;

    private Float Vol1;

    private Float SOC1;

    private Float Tem2;

    private Float Vol2;

    private Float SOC2;

    private Float Tem3;

    private Float Vol3;

    private Float SOC3;

    private Float Tem4;

    private Float Vol4;

    private Float SOC4;

    private Float Tem5;

    private Float Vol5;

    private Float SOC5;

    private Float Tem6;

    private Float Vol6;

    private Float SOC6;

    private Float Tem7;

    private Float Vol7;

    private Float SOC7;

    private Float Tem8;

    private Float Vol8;

    private Float SOC8;

    private Float Tem9;

    private Float Vol9;

    private Float SOC9;

    private Float Tem10;

    private Float Vol10;

    private Float SOC10;

    private Float Tem11;

    private Float Vol11;

    private Float SOC11;

    private Float Tem12;

    private Float Vol12;

    private Float SOC12;

    private Float Tem13;

    private Float Vol13;

    private Float SOC13;

    private Float Tem14;

    private Float Vol14;

    private Float SOC14;

    private Float Tem15;

    private Float Vol15;

    private Float SOC15;

    private Float Tem16;

    private Float Vol16;

    private Float SOC16;

    private Float Tem17;

    private Float Vol17;

    private Float SOC17;

    private Float Tem18;

    private Float Vol18;

    private Float SOC18;

    private Float Tem19;

    private Float Vol19;

    private Float SOC19;

    private Float Tem20;

    private Float Vol20;

    private Float SOC20;

    private Float Tem21;

    private Float Vol21;

    private Float SOC21;

    private Float Tem22;

    private Float Vol22;

    private Float SOC22;

    private Float Tem23;

    private Float Vol23;

    private Float SOC23;

    private Float Tem24;

    private Float Vol24;

    private Float SOC24;

    private Float Tem25;

    private Float Vol25;

    private Float SOC25;

    private Float Tem26;

    private Float Vol26;

    private Float SOC26;

    private Float Tem27;

    private Float Vol27;

    private Float SOC27;

    private Float Tem28;

    private Float Vol28;

    private Float SOC28;

    private Float Tem29;

    private Float Vol29;

    private Float SOC29;

    private Float Tem30;

    private Float Vol30;

    private Float SOC30;

    private Float Tem31;

    private Float Vol31;

    private Float SOC31;

    private Float Tem32;

    private Float Vol32;

    private Float SOC32;

    private Float Tem33;

    private Float Vol33;

    private Float SOC33;

    private Float Tem34;

    private Float Vol34;

    private Float SOC34;

    private Float Tem35;

    private Float Vol35;

    private Float SOC35;

    private Float Tem36;

    private Float Vol36;

    private Float SOC36;

    private Float Tem37;

    private Float Vol37;

    private Float SOC37;

    private Float Tem38;

    private Float Vol38;

    private Float SOC38;

    private Float Tem39;

    private Float Vol39;

    private Float SOC39;

    private Float Tem40;

    private Float Vol40;

    private Float SOC40;

    private Float Tem41;

    private Float Vol41;

    private Float SOC41;

    private Float Tem42;

    private Float Vol42;

    private Float SOC42;

    private Float Tem43;

    private Float Vol43;

    private Float SOC43;

    private Float Tem44;

    private Float Vol44;

    private Float SOC44;

    private Float Tem45;

    private Float Vol45;

    private Float SOC45;

    private Float Tem46;

    private Float Vol46;

    private Float SOC46;

    private Float Tem47;

    private Float Vol47;

    private Float SOC47;

    private Float Tem48;

    private Float Vol48;

    private Float SOC48;

    private Float Tem49;

    private Float Vol49;

    private Float SOC49;

    private Float Tem50;

    private Float Vol50;

    private Float SOC50;

    private Float Tem51;

    private Float Vol51;

    private Float SOC51;

    private Float Tem52;

    private Float Vol52;

    private Float SOC52;

    private Float Tem53;

    private Float Vol53;

    private Float SOC53;

    private Float Tem54;

    private Float Vol54;

    private Float SOC54;

    private Float Tem55;

    private Float Vol55;

    private Float SOC55;

    private Float Tem56;

    private Float Vol56;

    private Float SOC56;

    private Float Tem57;

    private Float Vol57;

    private Float SOC57;

    private Float Tem58;

    private Float Vol58;

    private Float SOC58;

    private Float Tem59;

    private Float Vol59;

    private Float SOC59;

    private Float Tem60;

    private Float Vol60;

    private Float SOC60;

    private Float Tem61;

    private Float Vol61;

    private Float SOC61;

    private Float Tem62;

    private Float Vol62;

    private Float SOC62;

    private Float Tem63;

    private Float Vol63;

    private Float SOC63;

    private Float Tem64;

    private Float Vol64;

    private Float SOC64;

    private Float Tem65;

    private Float Vol65;

    private Float SOC65;

    private Float Tem66;

    private Float Vol66;

    private Float SOC66;

    private Float Tem67;

    private Float Vol67;

    private Float SOC67;

    private Float Tem68;

    private Float Vol68;

    private Float SOC68;

    private Float Tem69;

    private Float Vol69;

    private Float SOC69;

    private Float Tem70;

    private Float Vol70;

    private Float SOC70;

    private Float Tem71;

    private Float Vol71;

    private Float SOC71;

    private Float Tem72;

    private Float Vol72;

    private Float SOC72;

    private Float Tem73;

    private Float Vol73;

    private Float SOC73;

    private Float Tem74;

    private Float Vol74;

    private Float SOC74;

    private Float Tem75;

    private Float Vol75;

    private Float SOC75;

    private Float Tem76;

    private Float Vol76;

    private Float SOC76;

    private Float Tem77;

    private Float Vol77;

    private Float SOC77;

    private Float Tem78;

    private Float Vol78;

    private Float SOC78;

    private Float Tem79;

    private Float Vol79;

    private Float SOC79;

    private Float Tem80;

    private Float Vol80;

    private Float SOC80;

    private Float Tem81;

    private Float Vol81;

    private Float SOC81;

    private Float Tem82;

    private Float Vol82;

    private Float SOC82;

    private Float Tem83;

    private Float Vol83;

    private Float SOC83;

    private Float Tem84;

    private Float Vol84;

    private Float SOC84;

    private Float Tem85;

    private Float Vol85;

    private Float SOC85;

    private Float Tem86;

    private Float Vol86;

    private Float SOC86;

    private Float Tem87;

    private Float Vol87;

    private Float SOC87;

    private Float Tem88;

    private Float Vol88;

    private Float SOC88;

    private Float Tem89;

    private Float Vol89;

    private Float SOC89;

    private Float Tem90;

    private Float Vol90;

    private Float SOC90;

    private Float Tem91;

    private Float Vol91;

    private Float SOC91;

    private Float Tem92;

    private Float Vol92;

    private Float SOC92;

    private Float Tem93;

    private Float Vol93;

    private Float SOC93;

    private Float Tem94;

    private Float Vol94;

    private Float SOC94;

    private Float Tem95;

    private Float Vol95;

    private Float SOC95;

    private Float Tem96;

    private Float Vol96;

    private Float SOC96;

    private Float Tem97;

    private Float Vol97;

    private Float SOC97;

    private Float Tem98;

    private Float Vol98;

    private Float SOC98;

    private Float Tem99;

    private Float Vol99;

    private Float SOC99;

    private Float Tem100;

    private Float Vol100;

    private Float SOC100;

    private Float Tem101;

    private Float Vol101;

    private Float SOC101;

    private Float Tem102;

    private Float Vol102;

    private Float SOC102;

    private Float Tem103;

    private Float Vol103;

    private Float SOC103;

    private Float Tem104;

    private Float Vol104;

    private Float SOC104;

    private Float Tem105;

    private Float Vol105;

    private Float SOC105;

    private Float Tem106;

    private Float Vol106;

    private Float SOC106;

    private Float Tem107;

    private Float Vol107;

    private Float SOC107;

    private Float Tem108;

    private Float Vol108;

    private Float SOC108;

    private Float Tem109;

    private Float Vol109;

    private Float SOC109;

    private Float Tem110;

    private Float Vol110;

    private Float SOC110;

    private Float Tem111;

    private Float Vol111;

    private Float SOC111;

    private Float Tem112;

    private Float Vol112;

    private Float SOC112;

    private Float Tem113;

    private Float Vol113;

    private Float SOC113;

    private Float Tem114;

    private Float Vol114;

    private Float SOC114;

    private Float Tem115;

    private Float Vol115;

    private Float SOC115;

    private Float Tem116;

    private Float Vol116;

    private Float SOC116;

    private Float Tem117;

    private Float Vol117;

    private Float SOC117;

    private Float Tem118;

    private Float Vol118;

    private Float SOC118;

    private Float Tem119;

    private Float Vol119;

    private Float SOC119;

    private Float Tem120;

    private Float Vol120;

    private Float SOC120;

    private Float Tem121;

    private Float Vol121;

    private Float SOC121;

    private Float Tem122;

    private Float Vol122;

    private Float SOC122;

    private Float Tem123;

    private Float Vol123;

    private Float SOC123;

    private Float Tem124;

    private Float Vol124;

    private Float SOC124;

    private Float Tem125;

    private Float Vol125;

    private Float SOC125;

    private Float Tem126;

    private Float Vol126;

    private Float SOC126;

    private Float Tem127;

    private Float Vol127;

    private Float SOC127;

    private Float Tem128;

    private Float Vol128;

    private Float SOC128;

    private Float Tem129;

    private Float Vol129;

    private Float SOC129;

    private Float Tem130;

    private Float Vol130;

    private Float SOC130;

    private Float Tem131;

    private Float Vol131;

    private Float SOC131;

    private Float Tem132;

    private Float Vol132;

    private Float SOC132;

    private Float Tem133;

    private Float Vol133;

    private Float SOC133;

    private Float Tem134;

    private Float Vol134;

    private Float SOC134;

    private Float Tem135;

    private Float Vol135;

    private Float SOC135;

    private Float Tem136;

    private Float Vol136;

    private Float SOC136;

    private Float Tem137;

    private Float Vol137;

    private Float SOC137;

    private Float Tem138;

    private Float Vol138;

    private Float SOC138;

    private Float Tem139;

    private Float Vol139;

    private Float SOC139;

    private Float Tem140;

    private Float Vol140;

    private Float SOC140;

    private Float Tem141;

    private Float Vol141;

    private Float SOC141;

    private Float Tem142;

    private Float Vol142;

    private Float SOC142;

    private Float Tem143;

    private Float Vol143;

    private Float SOC143;

    private Float Tem144;

    private Float Vol144;

    private Float SOC144;

    private Float Tem145;

    private Float Vol145;

    private Float SOC145;

    private Float Tem146;

    private Float Vol146;

    private Float SOC146;

    private Float Tem147;

    private Float Vol147;

    private Float SOC147;

    private Float Tem148;

    private Float Vol148;

    private Float SOC148;

    private Float Tem149;

    private Float Vol149;

    private Float SOC149;

    private Float Tem150;

    private Float Vol150;

    private Float SOC150;

    private Float Tem151;

    private Float Vol151;

    private Float SOC151;

    private Float Tem152;

    private Float Vol152;

    private Float SOC152;

    private Float Tem153;

    private Float Vol153;

    private Float SOC153;

    private Float Tem154;

    private Float Vol154;

    private Float SOC154;

    private Float Tem155;

    private Float Vol155;

    private Float SOC155;

    private Float Tem156;

    private Float Vol156;

    private Float SOC156;

    private Float Tem157;

    private Float Vol157;

    private Float SOC157;

    private Float Tem158;

    private Float Vol158;

    private Float SOC158;

    private Float Tem159;

    private Float Vol159;

    private Float SOC159;

    private Float Tem160;

    private Float Vol160;

    private Float SOC160;

    private Float Tem161;

    private Float Vol161;

    private Float SOC161;

    private Float Tem162;

    private Float Vol162;

    private Float SOC162;

    private Float Tem163;

    private Float Vol163;

    private Float SOC163;

    private Float Tem164;

    private Float Vol164;

    private Float SOC164;

    private Float Tem165;

    private Float Vol165;

    private Float SOC165;

    private Float Tem166;

    private Float Vol166;

    private Float SOC166;

    private Float Tem167;

    private Float Vol167;

    private Float SOC167;

    private Float Tem168;

    private Float Vol168;

    private Float SOC168;

    private Float Tem169;

    private Float Vol169;

    private Float SOC169;

    private Float Tem170;

    private Float Vol170;

    private Float SOC170;

    private Float Tem171;

    private Float Vol171;

    private Float SOC171;

    private Float Tem172;

    private Float Vol172;

    private Float SOC172;

    private Float Tem173;

    private Float Vol173;

    private Float SOC173;

    private Float Tem174;

    private Float Vol174;

    private Float SOC174;

    private Float Tem175;

    private Float Vol175;

    private Float SOC175;

    private Float Tem176;

    private Float Vol176;

    private Float SOC176;

    private Float Tem177;

    private Float Vol177;

    private Float SOC177;

    private Float Tem178;

    private Float Vol178;

    private Float SOC178;

    private Float Tem179;

    private Float Vol179;

    private Float SOC179;

    private Float Tem180;

    private Float Vol180;

    private Float SOC180;

    private Float Tem181;

    private Float Vol181;

    private Float SOC181;

    private Float Tem182;

    private Float Vol182;

    private Float SOC182;

    private Float Tem183;

    private Float Vol183;

    private Float SOC183;

    private Float Tem184;

    private Float Vol184;

    private Float SOC184;

    private Float Tem185;

    private Float Vol185;

    private Float SOC185;

    private Float Tem186;

    private Float Vol186;

    private Float SOC186;

    private Float Tem187;

    private Float Vol187;

    private Float SOC187;

    private Float Tem188;

    private Float Vol188;

    private Float SOC188;

    private Float Tem189;

    private Float Vol189;

    private Float SOC189;

    private Float Tem190;

    private Float Vol190;

    private Float SOC190;

    private Float Tem191;

    private Float Vol191;

    private Float SOC191;


}
